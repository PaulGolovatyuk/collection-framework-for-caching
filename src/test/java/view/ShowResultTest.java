package view;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShowResultTest {
    private ShowResult showResult = new ShowResult();
    private String nullString;

    @Test
    public void withoutRepeatingSymbolsTest() {
        String expected = "Light\n" +
                "\"L\" - 1\n" +
                "\"i\" - 1\n" +
                "\"g\" - 1\n" +
                "\"h\" - 1\n" +
                "\"t\" - 1\n";
        assertEquals(expected, showResult.buildResultString("Light"));
    }

    @Test
    public void withRepeatingSymbolsTest() {
        String expected = "hakkapeliitta\n" +
                "\"h\" - 1\n" +
                "\"a\" - 3\n" +
                "\"k\" - 2\n" +
                "\"p\" - 1\n" +
                "\"e\" - 1\n" +
                "\"l\" - 1\n" +
                "\"i\" - 2\n" +
                "\"t\" - 2\n";
        assertEquals(expected, showResult.buildResultString("hakkapeliitta"));
    }

    @Test
    public void severalWordsTest() {
        String expected = "Sh*t happens\n" +
                "\"S\" - 1\n" +
                "\"h\" - 2\n" +
                "\"*\" - 1\n" +
                "\"t\" - 1\n" +
                "\" \" - 1\n" +
                "\"a\" - 1\n" +
                "\"p\" - 2\n" +
                "\"e\" - 1\n" +
                "\"n\" - 1\n" +
                "\"s\" - 1\n";
        assertEquals(expected, showResult.buildResultString("Sh*t happens"));
    }

    @Test
    public void singleSymbolTest() {
        String expected = "$\n" +
                "\"$\" - 1\n";
        assertEquals(expected, showResult.buildResultString("$"));
    }

    @Test
    public void singleSymbolManyTimesTest() {
        String expected = "aaaaa\n" +
                "\"a\" - 5\n";
        assertEquals(expected, showResult.buildResultString("aaaaa"));
    }

    @Test
    public void uppercaseAndLowercaseTest() {
        String expected = "XxXxXx\n" +
                "\"X\" - 3\n" +
                "\"x\" - 3\n";
        assertEquals(expected, showResult.buildResultString("XxXxXx"));
    }

    @Test
    public void emptyStringTest() {
        String expected = "\n";
        assertEquals(expected, showResult.buildResultString(""));
    }


    @Test(expected = NullPointerException.class)
    public void notNullTest() {
        showResult.buildResultString(nullString);
    }
}
