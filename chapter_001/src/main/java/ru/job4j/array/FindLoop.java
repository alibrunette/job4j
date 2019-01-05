package ru.job4j.array;
/**
 *  FindLoop - классический способ поиска элемента в массиве.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version $Id$
 * @since 05.01.2019
 */

public class FindLoop {
    /**
     * Поиск элемента в массиве.
     * @param data - массив с числами.
     * @param el - число, которое нужно найти.
     * @return - индекс этого числа.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
