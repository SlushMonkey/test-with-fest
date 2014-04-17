package com.thoughtworks.fest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ConvertPressure implements ActionListener {
    private PressureConverter pressureConverter;

    public ConvertPressure(PressureConverter pressureConverter) {
        this.pressureConverter = pressureConverter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double result = 0;
        //convert to bar
        if (pressureConverter.comboBox1.getSelectedItem() == "Bar" ) {
            result = (double)(Double.parseDouble(pressureConverter.inputField.getText()));
        } else if (pressureConverter.comboBox1.getSelectedItem() == "Atm"){
            result = (double)(Double.parseDouble(pressureConverter.inputField.getText())) * 1.013;
        } else if (pressureConverter.comboBox1.getSelectedItem() == "PSI"){
            result = (double)(Double.parseDouble(pressureConverter.inputField.getText())) * 0.06895;
        } else if (pressureConverter.comboBox1.getSelectedItem() == "MPa"){
            result = (double)(Double.parseDouble(pressureConverter.inputField.getText())) * 10.0;
        }

        pressureConverter.barResult.setText(String.valueOf(result));
        pressureConverter.atmResult.setText(String.valueOf(result / 1.013));
        pressureConverter.psiResult.setText(String.valueOf(result / 0.06895));
        pressureConverter.mpaResult.setText(String.valueOf(result / 10.0));

    }
}
