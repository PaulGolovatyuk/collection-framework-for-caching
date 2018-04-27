package logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationsTest {
    private Calculations calculations = new Calculations();
    private String nullString;

    @Test
    public void addToStoredStringsMap() {
        assertTrue(calculations.addToStoredStringsMap("Shot"));
    }

    @Test
    public void addToStoredStringMapExistingString() {
        calculations.addToStoredStringsMap("World");
        assertFalse(calculations.addToStoredStringsMap("World"));
    }

    @Test
    public void isCurrentStringFromCacheTest() {
        assertFalse(calculations.isStringAbsent("Hello"));
        calculations.addToStoredStringsMap("Hello");
        assertTrue(calculations.isStringAbsent("Hello"));
    }

    @Test(expected = NullPointerException.class)
    public void notNullTest() {
        calculations.addToStoredStringsMap(nullString);
    }
}
