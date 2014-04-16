package com.thoughtworks.fest.actionlisteners;

import com.thoughtworks.fest.CelsiusToFahrenheitConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertToFahrenheit implements ActionListener {
    private CelsiusToFahrenheitConverter celsiusToFahrenheitConverter;

    public ConvertToFahrenheit(CelsiusToFahrenheitConverter celsiusToFahrenheitConverter) {
        this.celsiusToFahrenheitConverter = celsiusToFahrenheitConverter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int tempFahr = (int)((Double.parseDouble(celsiusToFahrenheitConverter.inputField.getText()))
                * 1.8 + 32);
        celsiusToFahrenheitConverter.resultLabel.setText(tempFahr + " Fahrenheit");
    }
}
