package ru.job4j.array;
/*
 * Square - Заполняет массив степенями чисел.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version $Id$
 * @since 30.12.2018
 **/
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect)); //мы сравниваем целиком массивы, а не отдельные числа.
    }
}