package ru.job4j.max;
/**
 * Max - максимум из двух чисел.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com).
 * @version 1.
 * @since 13.11.2018.
 */
public class Max {
    /**
     * Метод максимум из двух чисел.
     * @param first - первое значение.
     * @param second - второе значение.
     * @return - вычисленное значение.
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }
    /**
     * Метод максимум из трех чисел.
     * @param first - первое значение.
     * @param second - второе значение.
     * @param third - третье значение.
     * @return - вычисленное значение.
     */
    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

}
