package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class Test07VerifyingBehaviour {

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
    void should_InvokePayment_when_Prepaid(){
        //given
        BookingRequest bookingRequest= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 01, 05), 2, true);

        //when
        bookingService.makeBooking(bookingRequest);

        //then

        // When prepaid is true, check whether pay() method is called internally with correct arguments
        verify(paymentServiceMock).pay(bookingRequest, 400.0);

        // to check no. of times the method is called
        verify(paymentServiceMock, times(1)).pay(bookingRequest, 400.0);

        //pay() method should not be called again.
        verifyNoInteractions(paymentServiceMock);
    }

    @Test
    void should_NotInvokePayment_when_NotPrepaid(){

        //pay() method should not be called when prepaid is false

        //given
        BookingRequest bookingRequest= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 01, 05), 2, false);

        //when
        bookingService.makeBooking(bookingRequest);

        //then
        verify(paymentServiceMock, times(0)).pay(any(), anyDouble());

    }

}