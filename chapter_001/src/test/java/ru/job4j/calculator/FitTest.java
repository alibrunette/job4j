package ru.job4j.calculator;

/**
 * Сalculator.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version 1.
 * @since 07.11.2019.
 */

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {
    /**
     * Test closeTo.
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }
    /**
     * Test closeTo.
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}