package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class Test04MultiplethenReturnCalls {

    private BookingService bookingService;

    private PaymentService paymentServiceMock;
    private RoomService roomServiceMock;
    private BookingDAO bookingDAOMock;
    private MailSender mailSenderMock;

    @BeforeEach
    void setup(){
        this.paymentServiceMock= mock(PaymentService.class);
        this.roomServiceMock= mock(RoomService.class);
        this.bookingDAOMock= mock(BookingDAO.class);
        this.mailSenderMock= mock(MailSender.class);

        this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock);
    }


    @Test
    void should_CountAvailablePlaces_when_CalledMultipleTimes() {

       //chaining of thenReturn() to return different values at different calls

        //given
        when(this.roomServiceMock.getAvailableRooms())
                .thenReturn(Arrays.asList(new Room("Room 1", 4), new Room("Room 2", 3)))
                .thenReturn(Collections.emptyList());

        int expectedFirstCall= 7;
        int expectedSecondCall = 0;

        //when
        int actualFirstCall= this.bookingService.getAvailablePlaceCount();
        int actualSecondCall = this.bookingService.getAvailablePlaceCount();

        //then
        assertAll(
                ()->   assertEquals(expectedFirstCall, actualFirstCall),
                ()-> assertEquals(expectedSecondCall, actualSecondCall)
        );
        // Or we can write separate assertEquals() lines

    }

}