package com.servachak.desinepattens.demo1.View;

import com.servachak.desinepattens.demo1.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Model model;
    private JButton helloButton;
    private JButton goodBayButton;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;

        helloButton = new JButton("Hello.");
        goodBayButton = new JButton("Good bay.");

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;

        add(helloButton,gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;

        add(goodBayButton,gc);
        /*щоб зробити посилання на View об'єкт з класу Main, View view = new View(model), ми використовуємо слово this */
        helloButton.addActionListener(this);


        /*створюємо анонімний клас як альтернативу goodBayButton.addActionListener(this);
         * тепер нам не потрібно імплементовувати  implements ActionListener */
        goodBayButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sorry that you want go out");
            }
        });

        gc.fill = GridBagConstraints.NONE;

        /*розмір рамки*/
        setSize(600,600);

        /*при закритті вікна закривається програма*/
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        /*видимість рамки - без цього ми не побачимо наше вікно*/
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton sourse = (JButton) e.getSource();
        if (sourse == helloButton){
            System.out.println("Hello everyone");
        }
        else {
            System.out.println("Other button");
        }
    }
}
