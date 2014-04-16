package com.thoughtworks.fest;

import com.thoughtworks.fest.actionlisteners.GoToIntro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressureConverter {
    private JButton convertButton;
    public JPanel panel1;
    private JButton backButton;
    private JComboBox comboBox1;
    private JLabel mpaLabel;
    private JTextField inputField;
    private JLabel barResult;
    private JLabel atmResult;
    private JLabel psiResult;
    private JLabel mpaResult;

    public PressureConverter(GoToIntro goToIntro) {

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = 0;
                //convert to bar
                if (comboBox1.getSelectedItem() == "Bar" ) {
                    result = (double)(Double.parseDouble(inputField.getText()));
                } else if (comboBox1.getSelectedItem() == "Atm"){
                    result = (double)(Double.parseDouble(inputField.getText())) * 1.013;
                } else if (comboBox1.getSelectedItem() == "PSI"){
                    result = (double)(Double.parseDouble(inputField.getText())) * 0.06895;
                } else if (comboBox1.getSelectedItem() == "MPa"){
                    result = (double)(Double.parseDouble(inputField.getText())) * 10.0;
                }

                barResult.setText(String.valueOf(result));
                atmResult.setText(String.valueOf(result / 1.013));
                psiResult.setText(String.valueOf(result / 0.06895));
                mpaResult.setText(String.valueOf(result / 10.0));

            }
        });
        backButton.addActionListener(goToIntro);
    }
}
