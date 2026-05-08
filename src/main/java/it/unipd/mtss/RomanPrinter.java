////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String result = "";
        for (int i = 0; i < 6; i++) { // Supponendo un'altezza di 6 righe per l'ASCII Art
            for (char c : romanNumber.toCharArray()) {
                if (c == 'I') {
                    result += getCharRow(c, i);
                }
            }
            result += "\n";
        }
        return result;
    }

    private static String getCharRow(char c, int row) {
        // Implementa qui le righe per 'I' basandoti sull'esempio del PDF
        String[] iArt = {
            " _____  ",
            "|_   _| ",
            "  | |   ",
            "  | |   ",
            " _| |_  ",
            "|_____| "
        };
        return iArt[row];
    }
}
