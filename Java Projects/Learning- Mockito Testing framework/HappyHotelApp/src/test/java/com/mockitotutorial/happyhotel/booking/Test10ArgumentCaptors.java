package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

class Test10ArgumentCaptors {

    private BookingService bookingService;

    private PaymentService paymentServiceMock;
    private RoomService roomServiceMock;
    private BookingDAO bookingDAOMock;
    private MailSender mailSenderMock;
    private ArgumentCaptor<Double> doubleCaptor; // to capture double
    private ArgumentCaptor<BookingRequest> bookingRequestCaptor; // to capture BookingRequest

    @BeforeEach
    void setup(){
        this.paymentServiceMock= mock(PaymentService.class);
        this.roomServiceMock= mock(RoomService.class);
        this.bookingDAOMock= mock(BookingDAO.class);
        this.mailSenderMock= mock(MailSender.class);

        this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock);

        this.doubleCaptor = ArgumentCaptor.forClass(Double.class);
    }

    @Test
    void should_PayCorrectPrice_when_InputOk(){
        //given
        BookingRequest bookingRequest= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 01, 05), 2, true);

        //when
        bookingService.makeBooking(bookingRequest);

        //then
        verify(paymentServiceMock).pay(eq(bookingRequest), doubleCaptor.capture());
        double capturedArgument = doubleCaptor.getValue();

        assertEquals(400.0, capturedArgument);

    }

    @Test
    void should_PayCorrectPrices_when_MultipleCalls(){
        //given
        BookingRequest bookingRequest= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 01, 05), 2, true);

        BookingRequest bookingRequest2= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 01, 02), 2, true);

        List<Double> expectedValues = Arrays.asList(400.0, 100.0); //expected values

        //when
        bookingService.makeBooking(bookingRequest);
        bookingService.makeBooking(bookingRequest2);

        //then
        verify(paymentServiceMock, times(2)).pay(any(), doubleCaptor.capture());

        List<Double> capturedArguments = doubleCaptor.getAllValues();

        assertEquals(expectedValues, capturedArguments);

        // double capturedArgument = doubleCaptor.getValue();
        // assertEquals(400.0, capturedArgument);  Only last value will be checked since there are 2 calls to pay() method

    }

}