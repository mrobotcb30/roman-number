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
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (char c : romanNumber.toCharArray()) {
                result.append(getCharRow(c, i));
            }
            result.append("\n");
        }
        return result.toString();
    }

    private static String getCharRow(char c, int row) {
        String[] iArt = {" _____  ", "|_   _| ", "  | |   ", "  | |   ", " _| |_  ", "|_____| "};
        String[] vArt = {" __      __ ", " \\ \\    / / ", "  \\ \\  / /  ", "   \\ \\/ /   ", "    \\  /    ", "     \\/     "};
        String[] xArt = {" __  __ ", " \\ \\/ / ", "  \\  /  ", "  /  \\  ", " / /\\ \\ ", "/_/  \\_\\"};

        if (c == 'I') { return iArt[row]; }
        if (c == 'V') { return vArt[row]; }
        if (c == 'X') { return xArt[row]; }
        throw new IllegalArgumentException("Carattere non supportato");
    }
}