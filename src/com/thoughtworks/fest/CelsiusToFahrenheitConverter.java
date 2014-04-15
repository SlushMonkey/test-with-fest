package com.thoughtworks.fest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Thoughtworker on 4/11/14.
 */
public class CelsiusToFahrenheitConverter extends JPanel{
    public JPanel panel1;
    private JButton needMoreConversionsConvertButton;
    private JTextField inputField;
    private JButton convertButton;
    private JLabel fahrenheitLabel;
    private JLabel celsiusLabel;
    private JLabel resultLabel;

    public CelsiusToFahrenheitConverter(ActionListener goToRankineActionListener) {

        needMoreConversionsConvertButton.addActionListener(goToRankineActionListener);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(inputField.getText()))
                        * 1.8 + 32);
                resultLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }

}
