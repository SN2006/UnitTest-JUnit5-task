package com.example.util;

import com.example.controller.AppController;
import com.example.model.AppModel;
import com.example.view.AppView;

public class AppStarter {

    public void startApp(){
        AppModel model = new AppModel();
        AppView view = new AppView();
        AppController controller = new AppController(model, view);
        controller.runApp();
    }

}
