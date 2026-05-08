////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    // ---- Conversioni corrette (Right) ----

    @Test
    public void convert_one_returnsI() {
        // Arrange
        int number = 1;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("I", result);
    }

    @Test
    public void convert_two_returnsII() {
        // Arrange
        int number = 2;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("II", result);
    }

    @Test
    public void convert_three_returnsIII() {
        // Arrange
        int number = 3;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("III", result);
    }

    @Test
    public void convert_four_returnsIV() {
        // Arrange
        int number = 4;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("IV", result);
    }

    @Test
    public void convert_five_returnsV() {
        // Arrange
        int number = 5;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("V", result);
    }

    @Test
    public void convert_six_returnsVI() {
        // Arrange
        int number = 6;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("VI", result);
    }

    // ---- Boundary: limiti del range (Boundary) ----

    @Test(expected = IllegalArgumentException.class)
    public void convert_zero_throwsException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_negativeNumber_throwsException() {
        IntegerToRoman.convert(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_sevenOutOfRange_throwsException() {
        IntegerToRoman.convert(7);
    }
}
