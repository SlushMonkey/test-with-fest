package com.thoughtworks.fest.actionlisteners;

import com.thoughtworks.fest.FahrenheitToRankineConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToRankineConverter implements ActionListener {
    private final JFrame frame;

    public GoToRankineConverter(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setContentPane(new FahrenheitToRankineConverter(frame).panel1);
        frame.pack();
        frame.setVisible(true);
    }
}