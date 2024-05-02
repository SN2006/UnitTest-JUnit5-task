package com.example.util;

import com.example.exceptions.UnsuitableTemperatureException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AppValidatorTest {

    AppValidator validator;

    @BeforeEach
    void setUp() {
        validator = new AppValidator();
    }

    @ParameterizedTest
    @DisplayName("Test if temperature is in bounds")
    @ValueSource(strings = {"-10", "10", "25", "35"})
    void test_If_Temperature_Is_In_Bounds(String input) throws UnsuitableTemperatureException {
        assertEquals(Constants.TEMPERATURE_OK_MSG, validator.validate(input));
    }

    @ParameterizedTest
    @DisplayName("Test if temperature is not in bounds")
    @ValueSource(strings = {"-100", "-11", "36", "100"})
    void test_If_Temperature_Is_Not_In_Bounds(String input) {
        assertThrows(UnsuitableTemperatureException.class,
                () -> validator.validate(input), Constants.TEMPERATURE_BAD_MSG);
    }

    @Test
    @DisplayName("Test if input data is invalid")
    void test_If_Input_Data_Is_Invalid(){
        assertThrows(NumberFormatException.class,
                () -> validator.validate("Not number"));
    }

    @AfterEach
    void tearDown() {
        validator = null;
    }
}