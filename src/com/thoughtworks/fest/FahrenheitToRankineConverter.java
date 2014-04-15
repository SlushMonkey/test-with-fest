package com.thoughtworks.fest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Thoughtworker on 4/14/14.
 */
public class FahrenheitToRankineConverter {
    public JPanel panel1;
    private JButton backToTheIntroButton;
    private JButton convertButton;
    private JLabel rankineLabel;
    private JLabel resultLabel;
    private JLabel fahrenheitLabel;
    private JTextField inputField;

    public FahrenheitToRankineConverter(final JFrame frame) {
        backToTheIntroButton.addActionListener(new GoToIntro(frame));
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(inputField.getText()))
                         + 460);
                resultLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }


}
