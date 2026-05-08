////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void print_fifty_outputContainsLAsciiArt() {
        String result = RomanPrinter.print(50);
        assertEquals(
            " _       \n" +
            "| |      \n" +
            "| |      \n" +
            "| |      \n" +
            "| |____  \n" +
            "|______| \n",
            result
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_fiftyOne_throwsException() {
        RomanPrinter.print(51);
    }
}