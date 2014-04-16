package com.thoughtworks.fest.actionlisteners;

import com.thoughtworks.fest.CelsiusToFahrenheitConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToCelsiusConverter implements ActionListener {
    private final JFrame frame;
    GoToRankineConverter goToRankineConverter;

    public GoToCelsiusConverter(JFrame frame, GoToRankineConverter goToRankineConverter) {
        this.goToRankineConverter = goToRankineConverter;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setContentPane(new CelsiusToFahrenheitConverter(goToRankineConverter).panel1);
        frame.pack();
        frame.setVisible(true);
    }
}