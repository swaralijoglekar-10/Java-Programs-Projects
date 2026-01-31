package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class Test14StaticMethods {

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
    void should_CalculateCorrectPrice(){

        try(MockedStatic<CurrencyConverter> mockedConverter = mockStatic(CurrencyConverter.class)){
            //given
            BookingRequest bookingRequest= new BookingRequest("1", LocalDate.of(2020, 01, 01),
                    LocalDate.of(2020, 01, 05), 2, false);

            double expected = 400.0 * 0.8;
            mockedConverter.when(()-> CurrencyConverter.toEuro(anyDouble()))
                            .thenAnswer(inv-> (double) inv.getArgument(0)*0.8); //argument from toEuro() method is taken and multiplied by 0.8
            //getArgument(0) -> 1st argument passed to toEuro() method

            //when
            double actual = bookingService.calculatePriceEuro(bookingRequest);

            //then
            assertEquals(expected, actual);

        }

    }

}