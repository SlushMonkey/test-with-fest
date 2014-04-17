package com.thoughtworks.fest;

import com.thoughtworks.fest.actionlisteners.GoToIntro;

import javax.swing.*;

public class PressureConverter {
    private JButton convertButton;
    public JPanel panel1;
    private JButton backButton;
    public JComboBox comboBox1;
    private JLabel mpaLabel;
    public JTextField inputField;
    public JLabel barResult;
    public JLabel atmResult;
    public JLabel psiResult;
    public JLabel mpaResult;

    public PressureConverter(GoToIntro goToIntro) {

        convertButton.addActionListener(new ConvertPressure(this));
        backButton.addActionListener(goToIntro);
    }

}
