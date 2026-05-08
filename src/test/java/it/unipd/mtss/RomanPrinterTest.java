////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void print_ten_outputContainsXAsciiArt() {
        String result = RomanPrinter.print(10);
        assertEquals(
            " __  __ \n" +
            " \\ \\/ / \n" +
            "  \\  /  \n" +
            "  /  \\  \n" +
            " / /\\ \\ \n" +
            "/_/  \\_\\\n",
            result
        );
    }

    @Test
    public void print_nine_outputContainsIXAsciiArt() {
        String result = RomanPrinter.print(9);
        assertEquals(
            " _____   __  __ \n" +
            "|_   _|  \\ \\/ / \n" +
            "  | |     \\  /  \n" +
            "  | |     /  \\  \n" +
            " _| |_   / /\\ \\ \n" +
            "|_____| /_/  \\_\\\n",
            result
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_outOfRange_throwsException() {
        RomanPrinter.print(11);
    }
}