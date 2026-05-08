////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("Numero fuori range (1-100)");
        }

        int[] values =     {100, 90,   50,  40,   10,  9,    5,   4,    1};
        String[] symbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(symbols[i]);
                number -= values[i];
            }
        }
        return roman.toString();
    }
}