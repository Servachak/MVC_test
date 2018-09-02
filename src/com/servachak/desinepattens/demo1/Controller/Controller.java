package com.servachak.desinepattens.demo1.Controller;

import com.servachak.desinepattens.demo1.View.View;
import com.servachak.desinepattens.demo1.model.Model;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }
}
