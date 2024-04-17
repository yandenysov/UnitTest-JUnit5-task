package org.example.app.utils;

import org.example.app.exceptions.TemperatureException;

public class AppValidator {
    private static final double TEMPERATURE_BOTTOM_LIMIT = -10;
    private static final double TEMPERATURE_TOP_LIMIT = 35;

    public String validateTemperature(double temperature) throws TemperatureException {
        if (Double.isNaN(temperature)) { return "Please restart and try again.";}

        else if (temperature >= TEMPERATURE_BOTTOM_LIMIT
                & temperature <= TEMPERATURE_TOP_LIMIT) {
            return "Temperature is within limits. Data can be obtained.";
        }
        else {
            throw new TemperatureException("Exception: Temperature out of limits!");
        }
    }

}
