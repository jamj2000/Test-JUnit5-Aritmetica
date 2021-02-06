// José Antonio Muñoz Jiménez - Junio 2021
package ejemplo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

public class AritmeticaTest {

    @BeforeAll
    public static void setUpClass(){
        Aritmetica a = new Aritmetica();
    }
    
    @Test
    public void testSuma() {
        // 4 casos de prueba
        assertEquals( 5, Aritmetica.suma( 2, 3));
        assertEquals( 0, Aritmetica.suma(-2, 2));
        assertEquals(-3, Aritmetica.suma( 0,-3));
        assertEquals(-6, Aritmetica.suma(-3,-3));
    }

    @Test
    public void testResta() {
        // 4 casos de prueba
        assertEquals(-1, Aritmetica.resta( 2, 3));
        assertEquals(-4, Aritmetica.resta(-2, 2));
        assertEquals( 3, Aritmetica.resta( 0,-3));
        assertEquals( 0, Aritmetica.resta(-3,-3));
    }

    @Test
    public void testMultiplicacion() {
        // 4 casos de prueba
        assertEquals( 6, Aritmetica.multiplicacion( 2, 3));
        assertEquals(-4, Aritmetica.multiplicacion(-2, 2));
        assertEquals( 0, Aritmetica.multiplicacion( 0,-3));
        assertEquals( 9, Aritmetica.multiplicacion(-3,-3));
    }

    @Test
    public void testDivision() {
        // 4 casos de prueba
        assertEquals( 2.0/3, Aritmetica.division( 2, 3), 0.0000001);
        assertEquals(    -1, Aritmetica.division(-2, 2), 0.001);
        assertEquals(     0, Aritmetica.division( 0,-3), 0.001);
        assertEquals(     1, Aritmetica.division(-3,-3), 0.001);
    }

}

