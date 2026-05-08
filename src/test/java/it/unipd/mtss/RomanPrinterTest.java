////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class RomanPrinterTest {

    // ---- Stampe non nulle (Right) ----

    @Test
    public void print_one_returnsNonNullString() {
        // Arrange
        int number = 1;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertNotNull(result);
    }

    @Test
    public void print_two_returnsNonNullString() {
        // Arrange
        int number = 2;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertNotNull(result);
    }

    @Test
    public void print_three_returnsNonNullString() {
        // Arrange
        int number = 3;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertNotNull(result);
    }


    @Test
    public void print_four_returnsNonNullString() {
        // Arrange
        int number = 4;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertNotNull(result);
    }

    @Test
    public void print_five_returnsNonNullString() {
        // Arrange
        int number = 5;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertNotNull(result);
    }

    @Test
    public void print_six_returnsNonNullString() {
        // Arrange
        int number = 6;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertNotNull(result);
    }

    // ---- Contenuto corretto (Right) ----

    @Test
    public void print_one_outputContainsIAsciiArt() {
        // Arrange
        int number = 1;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertEquals(
            " _____  \n" +
            "|_   _| \n" +
            "  | |   \n" +
            "  | |   \n" +
            " _| |_  \n" +
            "|_____| \n",
            result
        );
    }

    @Test
    public void print_five_outputContainsVAsciiArt() {
        // Arrange
        int number = 5;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertEquals(
            "__   __ \n" +
            "\\ \\ / / \n" +
            " \\ V /  \n" +
            "  > <   \n" +
            " / . \\  \n" +
            "/_/ \\_\\ \n",
            result
        );
    }

    @Test
    public void print_four_outputContainsIVAsciiArt() {
        // Arrange
        int number = 4;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertEquals(
            " _____  __   __ \n" +
            "|_   _| \\ \\ / / \n" +
            "  | |    \\ V /  \n" +
            "  | |     > <   \n" +
            " _| |_   / . \\  \n" +
            "|_____| /_/ \\_\\ \n",
            result
        );
    }

    @Test
    public void print_six_outputContainsVIAsciiArt() {
        // Arrange
        int number = 6;

    public void print_three_outputContainsIIIAsciiArt() {
        // Arrange
        int number = 3;

        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertEquals(

            "__   __  _____  \n" +
            "\\ \\ / / |_   _| \n" +
            " \\ V /    | |   \n" +
            "  > <     | |   \n" +
            " / . \\   _| |_  \n" +
            "/_/ \\_\\ |_____| \n",

            " _____   _____   _____  \n" +
            "|_   _| |_   _| |_   _| \n" +
            "  | |     | |     | |   \n" +
            "  | |     | |     | |   \n" +
            " _| |_   _| |_   _| |_  \n" +
            "|_____| |_____| |_____| \n",

            result
        );
    }

    // ---- Boundary ----

    @Test(expected = IllegalArgumentException.class)
    public void print_zero_throwsException() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_sevenOutOfRange_throwsException() {
        RomanPrinter.print(7);
    }
}

    public void print_fourOutOfRange_throwsException() {
        // Dato che testiamo solo fino a 3, il 4 diventa il nuovo limite superiore
        RomanPrinter.print(4);
    }
}

