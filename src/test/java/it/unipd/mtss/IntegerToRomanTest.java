////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void convert_fourteen_returnsXIV() {
        // Arrange
        int number = 14;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("XIV", result);
    }

    @Test
    public void convert_nineteen_returnsXIX() {
        assertEquals("XIX", IntegerToRoman.convert(19));
    }

    @Test
    public void convert_twenty_returnsXX() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_twentyOneOutOfRange_throwsException() {
        IntegerToRoman.convert(21);
    }
}