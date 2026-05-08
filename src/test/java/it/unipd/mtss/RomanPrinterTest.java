////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void print_hundred_outputContainsCAsciiArt() {
        String result = RomanPrinter.print(100);
        assertEquals(
            "  _____  \n" +
            " / ____| \n" +
            "| |      \n" +
            "| |      \n" +
            "| |____  \n" +
            " \\_____| \n",
            result
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_hundredOne_throwsException() {
        RomanPrinter.print(101);
    }
}