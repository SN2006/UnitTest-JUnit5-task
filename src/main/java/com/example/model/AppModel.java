package com.example.model;

import com.example.exceptions.UnsuitableTemperatureException;
import com.example.util.AppValidator;
import com.example.util.Constants;

public class AppModel {

    private final AppValidator validator = new AppValidator();

    public String handleData(String data){
        try {
            return validator.validate(data);
        }catch (UnsuitableTemperatureException e){
            return e.getMessage();
        }catch (NumberFormatException e){
            return Constants.INVALID_INPUT_MSG;
        }
    }

}
