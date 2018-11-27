package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * FactorialTest - Вычисление факториала.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com).
 * @version 1.
 * @since 27.11.2018.
 */
public class FactorialTest {
    /**
     * Метод вычисляет факториал.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        assertThat(factorial.calc(5), is(120));//напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        assertThat(factorial.calc(0), is(1));//напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}
