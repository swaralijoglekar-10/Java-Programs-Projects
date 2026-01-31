package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

class Test08Spies {

    private BookingService bookingService;

    private PaymentService paymentServiceMock;
    private RoomService roomServiceMock;
    private BookingDAO bookingDAOMock;
    private MailSender mailSenderMock;

    @BeforeEach
    void setup(){
        this.paymentServiceMock= mock(PaymentService.class);
        this.roomServiceMock= mock(RoomService.class);
        this.bookingDAOMock= spy(BookingDAO.class); // spy returns real object with real logic
        this.mailSenderMock= mock(MailSender.class);

        this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock);
    }

    @Test
    void should_MakeBooking_when_InputOk(){
        //given
        BookingRequest bookingRequest= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 01, 05), 2, true);

        //when
        String bookingId= bookingService.makeBooking(bookingRequest);

        //then
        verify(bookingDAOMock).save(bookingRequest);
        System.out.println("Booking Id= "+bookingId);
    }

    @Test
    void should_CancelBooking_when_InputOk(){
        //given
        BookingRequest bookingRequest= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 01, 05), 2, true);
        bookingRequest.setRoomId("1.3");
        String bookingId= "1";
        doReturn(bookingRequest).when(bookingDAOMock).get(bookingId); //modified the behavior of method using spy

        //when
        bookingService.cancelBooking(bookingId);

        //then

    }

}