////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {

        if (number < 1 || number > 6) {
            throw new IllegalArgumentException("Numero fuori range (1-6)");
        }

        int[] values =     {5,   4,    1};
        String[] symbols = {"V", "IV", "I"};

        String roman = "";
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman += symbols[i];
                number -= values[i];
            }

        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("Numero fuori range (1-3)");
        }
        String roman = "";
        for (int i = 0; i < number; i++) {
            roman += "I";

        }
        return roman;
    }
}
