package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.internal.util.reflection.LenientCopyTool;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class Test13StrictStubbing {

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
    void should_InvokePayment_when_Prepaid(){
        //given
        BookingRequest bookingRequest= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 01, 05), 2, false);

        lenient().when(paymentServiceMock.pay(any(), anyDouble())).thenReturn("1"); //lenient()- to avoid strict stubbing

        //when
        bookingService.makeBooking(bookingRequest);

        //then
        // no exception is thrown
    }

}