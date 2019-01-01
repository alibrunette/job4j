package ru.job4j.array;
/**
 * Square - Заполняет массив степенями чисел.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version $Id$
 * @since 30.12.2018
 */

public class Square {
    /**
     * Заполняет массив числами возведенными в квадрат.
     * @param bound числа.
     * @return заполненный массив.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int tmp = 1;
        for(int x = 0; x != rst.length; x ++) {// заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
            rst[x] = tmp * tmp;
        }
        return rst;
    }
}

