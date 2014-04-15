package com.thoughtworks.fest;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversion App");

        IntroCard introCard = new IntroCard(frame);
        frame.setContentPane(introCard.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

