package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * CounterTest - подсчет суммы чётных чисел в диапазоне от start до finish.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com).
 * @version 1.
 * @since 25.11.2018.
 */
public class CounterTest {
    /**
     * Метод вычисляет сумму четныx чисел в диапазоне от start до finish.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        assertThat(counter.add(1, 10), is(30));
    }
}

