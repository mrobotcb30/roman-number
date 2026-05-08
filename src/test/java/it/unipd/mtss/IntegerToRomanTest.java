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
    public void convert_hundred_returnsC() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void convert_fourHundred_returnsCD() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void convert_fiveHundred_returnsD() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_fiveHundredOne_throwsException() {
        IntegerToRoman.convert(501);
    }
}