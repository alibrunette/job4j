package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Alina Maryenko (aliwka.l@gmail.com)
* @version $Id$
* @since 03.11.2018
*/
public class CalculateTest {
/**
* Test echo.
*/
@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Alina Maryenko";
    String expect = "Echo, echo, echo : Alina Maryenko"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}