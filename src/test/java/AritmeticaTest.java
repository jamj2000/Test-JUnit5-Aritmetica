import org.junit.Test;
import static org.junit.Assert.*;

public class AritmeticaTest {

    @Test
    public void testSuma() {
        assertEquals("Suma (2,3) = 5", 5, Aritmetica.suma(2,3));
    }

}

