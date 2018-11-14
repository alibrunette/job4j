package ru.job4j.converter;
/**
 * Сonverter.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version 1.
 * @since 07.11.2019.
 */
public class Converter {
    private static final int EURO = 70;
    private static final int DOLLAR = 60;
    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / EURO;
    }
      /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
                */
        public int rubleToDollar(int value) {
            return value /  DOLLAR;
        }
    /**
     * Конвертируем доллары в рубли.
     *
     * @param value доллары.
     * @return рубли.
     */
    public int dollarToRuble(int value) {
        return value;
    }
    /**
     * Конвертируем евро в рубли.
     *
     * @param value евро.
     * @return рубли.
     */

        public int еuroToRuble(int value) {
            return value;
    }
}


