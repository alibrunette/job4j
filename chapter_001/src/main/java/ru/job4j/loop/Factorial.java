package ru.job4j.loop;
/**
 * Factorial - класс, вычисляющий факториал.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com).
 * @version 1.
 * @since 27.11.2018.
 */

public class Factorial {
    /**
     * Вычисление факториала.
     *
     * @param n - положительное целое число.
     * @return рассчитанный факториал для n.
     */
    public int calc(int n) {
        int result = 1;
        for (int a = result; a <= n; a++) {
            if (n == 0) {
                return 1;
            } else {
                result *= a;
            }
        }
        return result;
    }
}


