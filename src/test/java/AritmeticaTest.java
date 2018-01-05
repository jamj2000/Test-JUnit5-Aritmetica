import org.junit.Test;
import static org.junit.Assert.*;

public class AritmeticaTest {

    @Test
    public void testSuma() {
        // 4 casos de prueba
        assertEquals("Suma ( 2, 3) debe ser  5",  5, Aritmetica.suma( 2, 3));
        assertEquals("Suma (-2, 2) debe ser  0",  0, Aritmetica.suma(-2, 2));
        assertEquals("Suma ( 0,-3) debe ser -3", -3, Aritmetica.suma( 0,-3));
        assertEquals("Suma (-3,-3) debe ser -6", -6, Aritmetica.suma(-3,-3));
    }

        @Test
    public void testResta() {
        // 4 casos de prueba
        assertEquals("Resta ( 2, 3) debe ser -1", -1, Aritmetica.resta( 2, 3));
        assertEquals("Resta (-2, 2) debe ser -4", -4, Aritmetica.resta(-2, 2));
        assertEquals("Resta ( 0,-3) debe ser  3",  3, Aritmetica.resta( 0,-3));
        assertEquals("Resta (-3,-3) debe ser  0",  0, Aritmetica.resta(-3,-3));
    }

    @Test
    public void testMultiplicacion() {
        // 4 casos de prueba
        assertEquals("Multiplicacion ( 2, 3) debe ser  6",  6, Aritmetica.multiplicacion( 2, 3));
        assertEquals("Multiplicacion (-2, 2) debe ser -4", -4, Aritmetica.multiplicacion(-2, 2));
        assertEquals("Multiplicacion ( 0,-3) debe ser  0",  0, Aritmetica.multiplicacion( 0,-3));
        assertEquals("Multiplicacion (-3,-3) debe ser  9",  9, Aritmetica.multiplicacion(-3,-3));
    }
/*
    @Test
    public void testDivision() {
        // 4 casos de prueba
        assertEquals("Suma ( 2, 3) debe ser  5",  5, Aritmetica.suma( 2, 3));
        assertEquals("Suma (-2, 2) debe ser  0",  0, Aritmetica.suma(-2, 2));
        assertEquals("Suma ( 0,-3) debe ser -3", -3, Aritmetica.suma( 0,-3));
        assertEquals("Suma (-3,-3) debe ser -6", -6, Aritmetica.suma(-3,-3));
    }
*/
}

