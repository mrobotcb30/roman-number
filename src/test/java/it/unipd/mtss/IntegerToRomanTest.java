////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void convert_forty_returnsXL() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void convert_fortyNine_returnsXLIX() {
        assertEquals("XLIX", IntegerToRoman.convert(49));
    }

    @Test
    public void convert_fifty_returnsL() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_fiftyOneOutOfRange_throwsException() {
        IntegerToRoman.convert(51);
    }
}