package com.thoughtworks.fest;

import com.thoughtworks.fest.actionlisteners.GoToCelsiusConverter;
import com.thoughtworks.fest.actionlisteners.GoToRankineConverter;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversion App");

        IntroCard introCard = new IntroCard(new GoToRankineConverter(frame), new GoToCelsiusConverter(frame, new GoToRankineConverter(frame)));
        frame.setContentPane(introCard.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

