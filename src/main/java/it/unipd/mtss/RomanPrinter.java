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
        for (int i = 0; i < 6; i++) {
            for (char c : romanNumber.toCharArray()) {
                result += getCharRow(c, i);
            }
            result += "\n";
        }
        return result;
    }

    private static String getCharRow(char c, int row) {
        String[] iArt = {
            " _____  ",
            "|_   _| ",
            "  | |   ",
            "  | |   ",
            " _| |_  ",
            "|_____| "
        };
        String[] vArt = {
            "__   __ ",
            "\\ \\ / / ",
            " \\ V /  ",
            "  > <   ",
            " / . \\  ",
            "/_/ \\_\\ "
        };
        if (c == 'I') {
            return iArt[row];
        } else if (c == 'V') {
            return vArt[row];
        }
        throw new IllegalArgumentException("Carattere romano non supportato: " + c);
    }
}
