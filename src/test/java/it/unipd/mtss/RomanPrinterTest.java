package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanPrinterTest {

    @Test
    void testPrint1() {
        String result = RomanPrinter.print(1);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }
}