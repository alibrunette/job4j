package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 *
 * PaintTest - Построить пирамиду в псевдографике.
 * @author Alina Maryenko(aliwka.l@gmail.com)
 * @version $Id$
 * @since 26.12.2018
 */
 public class PaintTest {
    /**
     * Метод строит правую часть пирамиды.
     */
    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator()).add("^   ").add("^^  ").add("^^^ ").add("^^^^").toString()));
    }
    /**
     * Метод строит левую часть пирамиды.
     */
    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator()).add("   ^").add("  ^^").add(" ^^^").add("^^^^").toString()));
    }
    /**
     * Метод строит полностью пирамиду.
     */
    @Test
    public void whenPyramid4LeftPir() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator()).add("   ^   ").add("  ^^^  ").add(" ^^^^^ ").add("^^^^^^^").toString()));
    }
}