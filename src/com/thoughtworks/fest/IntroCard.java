package com.thoughtworks.fest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Thoughtworker on 4/11/14.
 */
public class IntroCard extends JPanel{
    public JPanel panel1;
    private JButton goToConverterButton;

    public IntroCard(final JFrame frame) {
        goToConverterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new CelsiusToFahrenheitConverter(new GoToRankineConverter(frame)).panel1);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    private static class GoToRankineConverter implements ActionListener {
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
}
