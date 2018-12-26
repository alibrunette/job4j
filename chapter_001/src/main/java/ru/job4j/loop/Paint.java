package ru.job4j.loop;

import java.util.function.BiPredicate;
/**
 * Paint.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version $Id$
 * @since 26.12.2018
 */
public class Paint {
    /**
     * Метод строит правую часть пирамиды.
     *
     * @return результат.
     */
    public String rightTrl(int height) {
        return this.loopBy(height, height, (row, colum) -> row >= colum);
    }

    /**
     * Строим левую часть пирамиды.
     *
     * @return результат.
     */
    public String leftTrl(int height) {
        return this.loopBy(height, height, (row, colum) -> row >= height - colum - 1);
    }

    /**
     * Строим посностью пирамиду.
     *
     * @return результат.
     */
    public String pyramid(int height) {
        return this.loopBy(height, 2 * height - 1, (row, colum) -> row >= height - colum - 1 && row + height - 1 >= colum);
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
