package com.thoughtworks.fest._3_jbehave;

import com.thoughtworks.fest.CelsiusToFahrenheitConverter;
import com.thoughtworks.fest.FahrenheitToRankineConverter;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.fixture.FrameFixture;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusSteps extends Steps {
    private FrameFixture window;

    @Given("a working frameFixture")
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

    @Given("clean up")
    public void tearDown() {
        window.cleanUp();
    }


    @Given("a Celsius temperature of $input")
    public void givenACelsiusTemperatureOf(@Named("input")String input) {
        window.textBox("inputField").enterText(input);
    }

    @When("I convert to Fahrenheit")
    public void whenIConvertToFahrenheit() {
        window.button("convertButton").click();
    }

    @Then("I get a temperature of $expectedResult")
    public void thenIGetATemperatureOf(@Named("expectedResult")String expectedResult) {
        window.label("resultLabel").requireText(expectedResult);
    }

}
