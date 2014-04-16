package com.thoughtworks.fest._1_basic_fest;

import com.thoughtworks.fest.CelsiusToFahrenheitConverter;
import com.thoughtworks.fest.FahrenheitToRankineConverter;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.fixture.FrameFixture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusToFahrenheitConverterTest {

    private FrameFixture window;

    @BeforeMethod
    public void setUp() {
        JFrame frame = GuiActionRunner.execute(new GuiQuery<JFrame>() {
            protected JFrame executeInEDT() {
                final JFrame frame = new JFrame("celsiusConverter");
                frame.setContentPane(new CelsiusToFahrenheitConverter(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setContentPane(new FahrenheitToRankineConverter(frame).panel1);
                        frame.pack();
                        frame.setVisible(true);
                    }
                }).panel1);
                return frame;
            }
        });
        window = new FrameFixture(frame);
        window.show(); // shows the frame to test
    }

    @AfterMethod
    public void tearDown() {
        window.cleanUp();
    }

    @Test
    public void shouldConvertZeroDegreesCelsiusToThirtyTwoFahrenheit() {
        window.textBox("inputField").enterText("0");
        window.button("convertButton").click();
        window.label("resultLabel").requireText("32 Fahrenheit");
    }

}
