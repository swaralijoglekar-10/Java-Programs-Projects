package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class Test16FinalMethods {

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

    // getAvailablePlaceCount() method in BookingService is calling getAvailableRooms() method in RoomService
    // So we need data in RoomService mock
    // when getAvailableRooms() of RoomService is called, we need a List<Room>

    @Test
    void should_CountAvailablePlaces_When_OneRoomAvailable() {
        //given
        when(this.roomServiceMock.getAvailableRooms())
                .thenReturn(Collections.singletonList(new Room("Room 1", 5)));

        int expected = 5;

        //when
        int actual= this.bookingService.getAvailablePlaceCount();

        //then
        assertEquals(expected, actual);
    }


}