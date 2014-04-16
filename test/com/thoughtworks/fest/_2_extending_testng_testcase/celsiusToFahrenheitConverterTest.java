package com.thoughtworks.fest._2_extending_testng_testcase;

import com.thoughtworks.fest.CelsiusToFahrenheitConverter;
import com.thoughtworks.fest.actionlisteners.GoToRankineConverter;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.testng.testcase.FestSwingTestngTestCase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class CelsiusToFahrenheitConverterTest extends FestSwingTestngTestCase {
    private FrameFixture window;

    @BeforeMethod
    public void onSetUp() {
        JFrame frame = GuiActionRunner.execute(new GuiQuery<JFrame>() {
            protected JFrame executeInEDT() {
                final JFrame frame = new JFrame("celsiusConverter");
                frame.setContentPane(new CelsiusToFahrenheitConverter(new GoToRankineConverter(frame)).panel1);
                return frame;
            }
        });
        window = new FrameFixture(robot(), frame);
        window.show(); // shows the frame to test
    }

    @Test
    public void shouldConvertZeroDegreesCelsiusToThirtyTwoFahrenheit() {
        givenACelsiusTemperatureOf("0");
        whenIConvertToFahrenheit();
        thenIGet("32 Fahrenheit");
    }

    private void thenIGet(String result) {
        window.label("resultLabel").requireText(result);
    }

    private void whenIConvertToFahrenheit() {
        window.button("convertButton").click();
    }

    private void givenACelsiusTemperatureOf(String celsiusTemperature) {
        window.textBox("inputField").enterText(celsiusTemperature);
    }
}