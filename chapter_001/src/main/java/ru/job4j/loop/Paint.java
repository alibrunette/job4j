package ru.job4j.loop;
/**
 * Paint.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version $Id$
 * @since 26.12.2018
 */
public class Paint {
    /**
     * Метод рисует пирамиду из символа ^ и пробелов:
     * Метод строит правую часть пирамиды.
     * @param height  (h) - это высота пирамиды.
     * @return прорисованную шахматную доску.
     */
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();// Буфер для результата.
        String sl = System.lineSeparator();
        int weight = height;// ширина будет равна высоте.
        for (int row = 0; row != height; row++) { // внешний цикл двигается по строкам.
            for (int column = 0; column != weight; column++) { // внутренний цикл определяет положение ячейки в строке.
                if (row >= column) { // если строка равна ячейки, то рисуем галку, в данном случае строка определяем, сколько галок будет на строке
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(sl);
        }
        return screen.toString(); // Получаем результат.
    }

    /**
     * Строим левую часть пирамиды.
     * @param height- высота пирамиды.
     * @return результат.
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        String sl = System.lineSeparator();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(sl);
        }
        return screen.toString();
    }

    /**
     * Строим посностью пирамиду.
     * @param height size.
     * @return результат.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
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
