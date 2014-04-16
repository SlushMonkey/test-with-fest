package com.thoughtworks.fest.actionlisteners;

import com.thoughtworks.fest.PressureConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToPressureConverter implements ActionListener {
    private final JFrame frame;

    public GoToPressureConverter(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setContentPane(new PressureConverter(new GoToIntro(frame)).panel1);
        frame.pack();
        frame.setVisible(true);
    }
}