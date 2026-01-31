package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class Test12Bdd {

    @InjectMocks  //will inject mock, spy
    private BookingService bookingService;

    @Mock
    private PaymentService paymentServiceMock;

    @Mock
    private RoomService roomServiceMock;

    @Spy
    private BookingDAO bookingDAOMock;

    @Mock
    private MailSender mailSenderMock;

    @Captor
    private ArgumentCaptor<Double> doubleCaptor; // to capture double

    @Test
    void should_CountAvailablePlaces_When_OneRoomAvailable() {
        //given
        given(this.roomServiceMock.getAvailableRooms())
                .willReturn(Collections.singletonList(new Room("Room 1", 5)));

        int expected = 5;

        //when
        int actual= this.bookingService.getAvailablePlaceCount();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_InvokePayment_when_Prepaid(){
        //given
        BookingRequest bookingRequest= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 01, 05), 2, true);

        //when
        bookingService.makeBooking(bookingRequest);

        //then

        // to check no. of times the method is called
        //verify(paymentServiceMock, times(1)).pay(bookingRequest, 400.0);

        // BDD style
        then(paymentServiceMock).should(times(1)).pay(bookingRequest, 400.0);

        //pay() method should not be called again.
        verifyNoInteractions(paymentServiceMock);
    }

}