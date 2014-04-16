package com.thoughtworks.fest.actionlisteners;

import com.thoughtworks.fest.IntroCard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToIntro implements ActionListener {
    private final JFrame frame;
    private IntroCard introCard;

    public GoToIntro(JFrame frame) {
        this.frame = frame;
        introCard = new IntroCard(new GoToRankineConverter(this.frame), new GoToCelsiusConverter(this.frame, new GoToRankineConverter(this.frame)), new GoToPressureConverter(this.frame));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setContentPane(introCard.panel1);
        frame.pack();
        frame.setVisible(true);
    }
}