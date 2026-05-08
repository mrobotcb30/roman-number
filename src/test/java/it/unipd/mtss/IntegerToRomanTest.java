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
    public void convert_fifty_returnsL() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void convert_ninety_returnsXC() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void convert_hundred_returnsC() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_hundredOneOutOfRange_throwsException() {
        IntegerToRoman.convert(101);
    }
}