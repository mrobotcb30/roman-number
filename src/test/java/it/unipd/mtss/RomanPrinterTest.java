////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void print_fiveHundred_outputContainsDAsciiArt() {
        String result = RomanPrinter.print(500);
        assertEquals(
            " _____   \n" +
            "|  __ \\  \n" +
            "| |  | | \n" +
            "| |  | | \n" +
            "| |__| | \n" +
            "|_____/  \n",
            result
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_fiveHundredOne_throwsException() {
        RomanPrinter.print(501);
    }
}