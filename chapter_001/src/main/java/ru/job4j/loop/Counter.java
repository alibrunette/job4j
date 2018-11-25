package ru.job4j.loop;
/**
 * Counter - подсчет суммы чётных чисел в диапазоне.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com).
 * @version 1.
 * @since 25.11.2018.
 */

public class Counter {
    /**
     * Метод считает сумму четных чисел в диапозоне от start до finish.
     * @param start начальное число.
     * @param finish конечное число.
     * @return сумму чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum +=  i;
            }
        }
        return sum;
    }
}
