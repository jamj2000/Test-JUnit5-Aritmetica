package aritmetica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;

public class AritmeticaTest {

    @BeforeAll
    public static void setUpClass(){
        Aritmetica a = new Aritmetica();
    }
    
    @Test
    public void testSuma() {
        // 4 casos de prueba
        assertEquals(  5, Aritmetica.suma( 2, 3), "Suma ( 2, 3) debe ser  5");
        assertEquals(  0, Aritmetica.suma(-2, 2), "Suma (-2, 2) debe ser  0");
        assertEquals( -3, Aritmetica.suma( 0,-3), "Suma ( 0,-3) debe ser -3");
        assertEquals( -6, Aritmetica.suma(-3,-3), "Suma (-3,-3) debe ser -6");
    }

    @Test
    public void testResta() {
        // 4 casos de prueba
        assertEquals( -1, Aritmetica.resta( 2, 3), "Resta ( 2, 3) debe ser -1");
        assertEquals( -4, Aritmetica.resta(-2, 2), "Resta (-2, 2) debe ser -4");
        assertEquals(  3, Aritmetica.resta( 0,-3), "Resta ( 0,-3) debe ser  3");
        assertEquals(  0, Aritmetica.resta(-3,-3), "Resta (-3,-3) debe ser  0");
    }

    @Test
    public void testMultiplicacion() {
        // 4 casos de prueba
        assertEquals(  6, Aritmetica.multiplicacion( 2, 3), "Multiplicacion ( 2, 3) debe ser  6");
        assertEquals( -4, Aritmetica.multiplicacion(-2, 2), "Multiplicacion (-2, 2) debe ser -4");
        assertEquals(  0, Aritmetica.multiplicacion( 0,-3), "Multiplicacion ( 0,-3) debe ser  0");
        assertEquals(  9, Aritmetica.multiplicacion(-3,-3), "Multiplicacion (-3,-3) debe ser  9");
    }

    @Test
    public void testDivision() {
        // 4 casos de prueba
        assertEquals(2.0/3, Aritmetica.division( 2, 3), 0.001, "División ( 2, 3) debe ser 0.66");
        assertEquals(   -1, Aritmetica.division(-2, 2), 0.001, "División (-2, 2) debe ser   -1");
        assertEquals(    0, Aritmetica.division( 0,-3), 0.001, "División ( 0,-3) debe ser    0");
        assertEquals(    1, Aritmetica.division(-3,-3), 0.001, "División (-3,-3) debe ser    1");
    }

}

