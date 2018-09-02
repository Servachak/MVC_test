package com.servachak.desinepattens.demo1;

import com.servachak.desinepattens.demo1.Controller.Controller;
import com.servachak.desinepattens.demo1.View.View;
import com.servachak.desinepattens.demo1.model.Model;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });

    }
    public static void runApp(){
        Model model = new Model();

        View view = new View(model);

        Controller controller = new Controller(view,model);
    }
}
