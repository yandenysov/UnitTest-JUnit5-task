package org.example.app.utils;

import org.example.app.exceptions.TemperatureException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppValidatorTest {

    AppValidator validator;

    @BeforeEach
    void setUp() { validator = new AppValidator();}

    @Test
    @DisplayName("Test if temperature is in limits.")
    void test_If_Temperature_Is_In_Limits() throws TemperatureException {
        assertEquals("Temperature is within limits. Data can be obtained.",
                validator.validateTemperature(30));
    }

    @Test
    @DisplayName("Test if invalid temperature throws exception.")
    void test_If_Invalid_Temperature_Throws_Exception() {
        assertThrows(TemperatureException.class, () ->
                validator.validateTemperature(-15), "No exception.");
    }


    @AfterEach
    void tearDown() { validator = null;}
}