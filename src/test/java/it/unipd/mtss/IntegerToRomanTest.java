////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void convert_one_returnsI() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void convert_six_returnsVI() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void convert_seven_returnsVII() {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void convert_nine_returnsIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void convert_ten_returnsX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    // ---- Boundary ----

    @Test(expected = IllegalArgumentException.class)
    public void convert_zero_throwsException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_elevenOutOfRange_throwsException() {
        IntegerToRoman.convert(11);
    }
}