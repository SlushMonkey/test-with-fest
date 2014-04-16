package com.thoughtworks.fest.actionlisteners;

import com.thoughtworks.fest.FahrenheitToRankineConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertToRankine implements ActionListener {
    private FahrenheitToRankineConverter fahrenheitToRankineConverter;

    public ConvertToRankine(FahrenheitToRankineConverter fahrenheitToRankineConverter) {
        this.fahrenheitToRankineConverter = fahrenheitToRankineConverter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int tempFahr = (int)((Double.parseDouble(fahrenheitToRankineConverter.inputField.getText()))
                 + 460);
        fahrenheitToRankineConverter.resultLabel.setText(tempFahr + " Fahrenheit");
    }
}
