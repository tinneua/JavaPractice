package Practicum3.Task5;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;


public class DoublesTest {

    @Test
    public void checkNumbers() {
        Double actual = new Doubles().parse("12");
        assertThat(actual, is(12.0));
    }

    @Test
    public void checkNegativeSign() {
        Double actual = new Doubles().parse("-12");
        assertThat(actual, is(-12.0));
    }

    @Test
    public void checkPositiveSign() {
        Double actual = new Doubles().parse("+12");
        assertThat(actual, is(12.0));
    }

    @Test
    public void checkDecimal() {
        Double actual = new Doubles().parse("12.22");
        assertThat(actual, is(12.22));
    }

    @Test
    public void checkOnlyDecimal() {
        Double actual = new Doubles().parse(".22");
        assertThat(actual, is(0.22));
    }

    @Test
    public void checkCommaOnly() {
        Double actual = new Doubles().parse(".");
        assertNull(actual);
    }

    @Test
    public void checkExponent() {
        Double actual = new Doubles().parse("10.e2");
        assertThat(actual, is(10.e2));
    }

    @Test
    public void checkComplexNumberInput() {
        Double actual = new Doubles().parse("-.56e-2");
        assertThat(actual, is(-.56e-2));
    }

}