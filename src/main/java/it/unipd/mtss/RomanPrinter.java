package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {

    private static final int HEIGHT = 6;

    private static final Map<Character, String[]> FONT = new HashMap<>();

    static {
        FONT.put('I', new String[]{
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        });

        FONT.put('V', new String[]{
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
        });

        FONT.put('X', new String[]{
            "__   __",
            "\\ \\ / /",
            " \\ V / ",
            "  > <  ",
            " / . \\ ",
            "/_/ \\_\\"
        });

        FONT.put('L', new String[]{
            " _      ",
            "| |     ",
            "| |     ",
            "| |     ",
            "| |____ ",
            "|______|"
        });

        FONT.put('C', new String[]{
            "  _____ ",
            " / ____|",
            "| |     ",
            "| |     ",
            "| |____ ",
            " \\_____|"
        });

        FONT.put('D', new String[]{
            " _____  ",
            "|  __ \\ ",
            "| |  | |",
            "| |  | |",
            "| |__| |",
            "|_____/ "
        });

        FONT.put('M', new String[]{
            " __  __ ",
            "|  \\/  |",
            "| \\  / |",
            "| |\\/| |",
            "| |  | |",
            "|_|  |_|"
        });
    }

    public static String print(int num) {
        String roman = IntegerToRoman.convert(num);
        return buildAscii(roman);
    }

    private static String buildAscii(String roman) {

        StringBuilder[] lines = new StringBuilder[HEIGHT];

        for (int i = 0; i < HEIGHT; i++) {
            lines[i] = new StringBuilder();
        }

        for (char c : roman.toCharArray()) {
            String[] symbol = FONT.get(c);

            for (int i = 0; i < HEIGHT; i++) {
                lines[i].append(symbol[i]).append("  ");
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder line : lines) {
            result.append(line).append("\n");
        }

        return result.toString();
    }
}