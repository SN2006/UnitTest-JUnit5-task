package com.example.controller;

import com.example.model.AppModel;
import com.example.util.Constants;
import com.example.view.AppView;

public class AppController {

    private final AppModel model;
    private final AppView view;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        view.getOutput(Constants.TEMPERATURE_LIMIT_MSG);
        view.getOutput(model.handleData(view.getTemperature()));
    }
}
