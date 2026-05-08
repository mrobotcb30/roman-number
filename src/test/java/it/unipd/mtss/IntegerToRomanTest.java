////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConstructor() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals(IntegerToRoman.class, converter.getClass());
    }

    @Test
    public void convert_one_returnsI() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void convert_four_returnsIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void convert_nine_returnsIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void convert_forty_returnsXL() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void convert_fourHundred_returnsCD() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }


    @Test
    public void convert_nineHundredNinetyNine_returnsCMXCIX() {
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
    }

    @Test
    public void convert_thousand_returnsM() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_zero_throwsException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_tooHigh_throwsException() {
        IntegerToRoman.convert(1001);
    }
}
