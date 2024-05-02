package com.example.model;

import com.example.util.Constants;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppModelTest {

    AppModel model;

    @BeforeEach
    void setUp() {
        model = new AppModel();
    }

    @Test
    @DisplayName("Test if temperature is in bounds")
    void test_If_Temperature_Is_In_Bounds(){
        assertEquals(Constants.TEMPERATURE_OK_MSG, model.handleData("15"));
    }

    @Test
    @DisplayName("Test if temperature is not in bounds")
    void test_If_Temperature_Is_Not_In_Bounds(){
        assertEquals(Constants.TEMPERATURE_BAD_MSG, model.handleData("50"));
    }

    @Test
    @DisplayName("Test if input data is invalid")
    void test_If_Input_Data_Is_Invalid(){
        assertEquals(Constants.INVALID_INPUT_MSG, model.handleData("15grad Celsius"));
    }

    @AfterEach
    void tearDown() {
        model = null;
    }
}