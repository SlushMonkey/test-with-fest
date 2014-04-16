package com.thoughtworks.fest;

import com.thoughtworks.fest.actionlisteners.GoToCelsiusConverter;
import com.thoughtworks.fest.actionlisteners.GoToPressureConverter;
import com.thoughtworks.fest.actionlisteners.GoToRankineConverter;

import javax.swing.*;


public class IntroCard extends JPanel{
    public JPanel panel1;
    private JButton goToConverterButton;
    private JButton convertPressuresButton;
    GoToRankineConverter goToRankineConverter;

    public IntroCard(GoToRankineConverter rankineConverter, GoToCelsiusConverter goToCelsiusConverter, GoToPressureConverter goToPressureConverter) {
        goToRankineConverter = rankineConverter;
        goToConverterButton.addActionListener(goToCelsiusConverter);
        convertPressuresButton.addActionListener(goToPressureConverter);
    }

}
