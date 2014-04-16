package com.thoughtworks.fest._2_extending_testng_testcase;

import com.thoughtworks.fest.IntroCard;
import com.thoughtworks.fest.actionlisteners.GoToCelsiusConverter;
import com.thoughtworks.fest.actionlisteners.GoToPressureConverter;
import com.thoughtworks.fest.actionlisteners.GoToRankineConverter;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.testng.testcase.FestSwingTestngTestCase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class IntroCardTest extends FestSwingTestngTestCase {
    private FrameFixture window;

    @BeforeMethod
    public void onSetUp() {
        JFrame frame = GuiActionRunner.execute(new GuiQuery<JFrame>() {
            protected JFrame executeInEDT() {
                final JFrame frame = new JFrame("introCard");
                frame.setContentPane(new IntroCard(new GoToRankineConverter(frame), new GoToCelsiusConverter(frame, new GoToRankineConverter(frame)), new GoToPressureConverter(frame)).panel1);
                return frame;
            }
        });
        window = new FrameFixture(robot(), frame);
        window.show(); // shows the frame to test
    }

    @Test
    public void shouldNavigateToTemperatureConverter() {
        givenIAmOnTheIntroductionPane();
        whenINavigateToTheTemperatureConverter();
        thenIAmTakenToTheTemperatureConverterPane();
    }

    private void thenIAmTakenToTheTemperatureConverterPane() {
        window.label("celsiusLabel").requireText("Celsius");
    }

    private void whenINavigateToTheTemperatureConverter() {
        window.button("convertTemperature").click();
    }

    private void givenIAmOnTheIntroductionPane() {
    }
}
