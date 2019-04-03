package com.daehosting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void getTemperatureConversionsSoap() {
    }

    @Test
    void getTemperatureConversionsSoap1() {
    }

    @Test
    void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result1 = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), result1);
        BigDecimal result2 = service.fahrenheitToCelsius(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(-17.77777775), result2);
        BigDecimal result3 = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(1.41), result3);
        BigDecimal result4 = service.windChillInFahrenheit(BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(3.17800013), result4);

    }

    @Test
    void getTemperatureConversionsSoap121() {
    }
}