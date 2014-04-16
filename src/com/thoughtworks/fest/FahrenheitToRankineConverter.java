package com.thoughtworks.fest;

import com.thoughtworks.fest.actionlisteners.ConvertToRankine;
import com.thoughtworks.fest.actionlisteners.GoToIntro;

import javax.swing.*;

/**
 * Created by Thoughtworker on 4/14/14.
 */
public class FahrenheitToRankineConverter {
    public JPanel panel1;
    private JButton backToTheIntroButton;
    public JButton convertButton;
    private JLabel rankineLabel;
    public JLabel resultLabel;
    private JLabel fahrenheitLabel;
    public JTextField inputField;

    public FahrenheitToRankineConverter(final JFrame frame) {
        backToTheIntroButton.addActionListener(new GoToIntro(frame));
        convertButton.addActionListener(new ConvertToRankine(this));
    }


}
