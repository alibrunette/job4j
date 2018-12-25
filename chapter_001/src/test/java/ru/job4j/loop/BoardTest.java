package ru.shifu.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * BoardTest - проверяет построили шахматную доску в псевдографике.
 *
 * @author Alina Maryenko(aliwka.l@gmail.com)
 * @version $Id$
 * @since 25.12.2018.
 */
public class BoardTest {
    /**
     * Доска 3 на 3 имеет след. вид:
     *   Х Х
     *    Х
     *   Х Х
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X X%s X %sX X%s", line, line, line);//String.format позволяет использовать маркеры, в которые можно вставить переменные. Маркеры - %s, %d
        assertThat(result, is(expected));
    }

    /**
     *  Доска 5 на 4 имеет след. вид:
     *        Х	 Х  Х
     *        	Х Х
     *        Х	 Х 	Х
     *  	    Х Х
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        //напишите здесь тест, проверяющий формирование доски 5 на 4.
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X X X%s X X %sX X X%s X X %s", line, line, line, line);
    }
}