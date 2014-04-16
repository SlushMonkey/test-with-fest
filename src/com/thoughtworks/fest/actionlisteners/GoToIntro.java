package com.thoughtworks.fest.actionlisteners;

import com.thoughtworks.fest.IntroCard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToIntro implements ActionListener {
    private final JFrame frame;

    public GoToIntro(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setContentPane(new IntroCard(new GoToRankineConverter(frame), new GoToCelsiusConverter(frame, new GoToRankineConverter(frame))).panel1);
        frame.pack();
        frame.setVisible(true);
    }
}