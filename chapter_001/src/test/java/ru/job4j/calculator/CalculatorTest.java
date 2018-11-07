package ru.job4j.calculator;
/**
 * Calculator.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version 1.
 * @since 07.11.2018.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    /**
     * Сложение чисел.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Деление чисел.
     */
    @Test
    public void whenDiv2On2Then1() {
        Calculator calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }
    /**
     * Вычитание чисел.
     */
    @Test
    public void whenSubtract2From1Then1() {
        Calculator calc = new Calculator();
        calc.subtract(2D, 1D);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }
    /**
     * Умножение чисел.
     */
    @Test
    public void whenMultiple1on3Then3() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 3D);
        double result = calc.getResult();
        double expected = 3;
        assertThat(result, is(expected));
    }
}