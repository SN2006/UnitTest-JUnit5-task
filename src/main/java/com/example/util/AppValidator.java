package com.example.util;

import com.example.exceptions.UnsuitableTemperatureException;

public class AppValidator {

    public String validate(String data) throws UnsuitableTemperatureException {
        int temperature = handleData(data);
        if (temperature >= -10 && temperature <= 35){
            return Constants.TEMPERATURE_OK_MSG;
        }
        throw new UnsuitableTemperatureException(Constants.TEMPERATURE_BAD_MSG);
    }

    private int handleData(String data){
        return Integer.parseInt(data.trim());
    }

}
