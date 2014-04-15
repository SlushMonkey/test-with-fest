package com.thoughtworks.fest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IntroCard extends JPanel{
    public JPanel panel1;
    private JButton goToConverterButton;
    GoToRankineConverter goToRankineConverter;

    public IntroCard(final JFrame frame) {
        goToRankineConverter = new GoToRankineConverter(frame);

        goToConverterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new CelsiusToFahrenheitConverter(goToRankineConverter).panel1);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
