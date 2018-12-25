package ru.job4j.loop;
/**
 * Board.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version $Id$
 * @since 25.12.2018
 */
public class Board {
    /**
     * Метод рисует шахматную доску из символов x и пробелов;
     * @param width горизонталь.
     * @param height вертикаль.
     * @return прорисованную шахматную доску.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();//Класс StringBuilder служит для построения строки
        String ln = System.lineSeparator();
        for (int i = 0; i< width; i++) {
            for (int f = 0; f < height; f++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + f) % 2 == 0) {
                    screen.append("X");//метод append добавляет символы и строки в некоторый буфер StringBuilder-а, вместо вывода на консоль
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();//При вызове метода toString для StringBuilder - он возвращает все добавленные в него символы и строки в одну строку.
    }
}