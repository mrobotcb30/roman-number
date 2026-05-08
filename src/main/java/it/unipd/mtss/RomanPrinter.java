////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    private static final String[] I_ART = {
        " _____  ", "|_   _| ", "  | |   ", "  | |   ", " _| |_  ", "|_____| "
    };
    private static final String[] V_ART = {
        " __      __ ", " \\ \\    / / ", "  \\ \\  / /  ", "   \\ \\/ /   ", "    \\  /    ", "     \\/     "
    };
    private static final String[] X_ART = {
        " __  __ ", " \\ \\/ / ", "  \\  /  ", "  /  \\  ", " / /\\ \\ ", "/_/  \\_\\"
    };
    private static final String[] L_ART = {
        " _       ", "| |      ", "| |      ", "| |      ", "| |____  ", "|______| "
    };
    private static final String[] C_ART = {
        "  _____  ", " / ____| ", "| |      ", "| |      ", "| |____  ", " \\_____| "
    };
    private static final String[] D_ART = {
        " _____   ", "|  __ \\  ", "| |  | | ", "| |  | | ", "| |__| | ", "|_____/  "
    };
    private static final String[] M_ART = {
        " __  __  ", "|  \\/  | ", "| \\  / | ", "| |\\/| | ", "| |  | | ", "|_|  |_| "
    };

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
        switch (c) {
            case 'I': return I_ART[row];
            case 'V': return V_ART[row];
            case 'X': return X_ART[row];
            case 'L': return L_ART[row];
            case 'C': return C_ART[row];
            case 'D': return D_ART[row];
            case 'M': return M_ART[row];
            default: throw new IllegalArgumentException("Carattere non supportato");
        }
    }
}