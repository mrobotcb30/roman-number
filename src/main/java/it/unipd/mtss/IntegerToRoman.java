////////////////////////////////////////////////////////////////////
// CORRADO BACCO 2148615
// GABRIELE GAMBARRO 2147979
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
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
