////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void print_twenty_outputContainsXXAsciiArt() {
        // Arrange
        int number = 20;
        // Act
        String result = RomanPrinter.print(number);
        // Assert (Due X affiancate)
        assertEquals(
            " __  __  __  __ \n" +
            " \\ \\/ /  \\ \\/ / \n" +
            "  \\  /    \\  /  \n" +
            "  /  \\    /  \\  \n" +
            " / /\\ \\  / /\\ \\ \n" +
            "/_/  \\_\\/_/  \\_\\\n",
            result
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_twentyOne_throwsException() {
        RomanPrinter.print(21);
    }
}