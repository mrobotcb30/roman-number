////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class RomanPrinterTest {

    // Test del costruttore per massimizzare il Code Coverage (Coveralls)
    @Test
    public void testConstructor() {
        RomanPrinter printer = new RomanPrinter();
        assertNotNull(printer);
    }

    // Verifica che l'output abbia sempre esattamente 6 righe per i vari simboli
    @Test
    public void print_anySupportedNumber_shouldProduceSixLines() {
        int[] testNumbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        
        for (int n : testNumbers) {
            String result = RomanPrinter.print(n);
            // split("\n", -1) conta anche l'ultima riga vuota dopo l'ultimo \n
            // dato che aggiungiamo \n alla fine di ogni riga, ci aspettiamo 6 righe + 1 vuota finale
            assertEquals("Errore nel numero di righe per: " + n, 7, result.split("\n", -1).length);
        }
    }

    // Verifica puntuale del disegno ASCII per un numero base (I)
    @Test
    public void print_one_returnsCorrectAsciiArt() {
        // Arrange
        int number = 1;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        String expected = 
            " _____  \n" +
            "|_   _| \n" +
            "  | |   \n" +
            "  | |   \n" +
            " _| |_  \n" +
            "|_____| \n";
        assertEquals(expected, result);
    }

    // Verifica che l'output per 1000 contenga il pezzo forte della lettera M
    @Test
    public void print_thousand_containsMAsciiArt() {
        String result = RomanPrinter.print(1000);
        assertEquals(true, result.contains("|  \\/  |"));
    }

    // Verifica che il metodo non restituisca mai null
    @Test
    public void print_shouldNeverReturnNull() {
        assertNotNull(RomanPrinter.print(7));
    }

    // ---- Test delle Eccezioni (Range 1-1000) ----

    @Test(expected = IllegalArgumentException.class)
    public void print_zero_shouldThrowException() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_overThousand_shouldThrowException() {
        RomanPrinter.print(1001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_negativeNumber_shouldThrowException() {
        RomanPrinter.print(-10);
    }
}