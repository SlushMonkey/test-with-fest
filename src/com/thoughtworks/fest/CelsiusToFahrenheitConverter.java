package com.thoughtworks.fest;

import com.thoughtworks.fest.actionlisteners.ConvertToFahrenheit;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Thoughtworker on 4/11/14.
 */
public class CelsiusToFahrenheitConverter extends JPanel{
    public JPanel panel1;
    private JButton needMoreConversionsConvertButton;
    public JTextField inputField;
    private JButton convertButton;
    private JLabel fahrenheitLabel;
    private JLabel celsiusLabel;
    public JLabel resultLabel;

    public CelsiusToFahrenheitConverter(ActionListener goToRankineActionListener) {

        needMoreConversionsConvertButton.addActionListener(goToRankineActionListener);

        convertButton.addActionListener(new ConvertToFahrenheit(this));
    }

}
