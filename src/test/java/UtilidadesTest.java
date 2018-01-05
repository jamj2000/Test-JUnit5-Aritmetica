import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class UtilidadesTest {
    // número de casos de prueba
    private int n; 
    // rango de números
    private int min;
    private int max;
    
    @Before
    public void setUp() {
        // Aquí ponemos lo que deseamos ejecutar antes de iniciar cada test.
        n = 10; 
        min = -100;
        max =  100;
    }

    
    @Test
    public void testOrdenar3Iguales() {
        for (int i = 0 ; i < n ; i++ ) {
            int n1 = (int)Math.random()*(max - min) + min + 1;     
            assertArrayEquals("3 números iguales", new int[]{ n1, n1, n1 } , Utilidades.ordenar( n1, n1, n1 ));
        }
    }

    @Test
    public void testOrdenar2Iguales() {
        for (int i = 0 ; i < n ; i++ ) {
            int n1 = (int)Math.random()*(max - min) + min + 1;
            assertArrayEquals("2 números iguales", new int[]{ n1-3, n1, n1 } , Utilidades.ordenar( n1, n1, n1-3 ));
        }
    }

    @Test
    public void testOrdenarConsecutivos() {
        for (int i = 0 ; i < n ; i++ ) {
            int n1 = (int)Math.random()*(max - min) + min + 1;            
            assertArrayEquals("Números consecutivos", new int[]{ n1, n1+1, n1+2 } , Utilidades.ordenar( n1, n1+1, n1+2 ));
        }
    }

    @Test
    public void testOrdenarConsecutivosInverso() {
      for (int i = 0 ; i < n ; i++ ) {
            int n1 = (int)Math.random()*(max - min) + min + 1;            
            assertArrayEquals("Números consecutivos en orden inverso", new int[]{ n1-2, n1-1, n1 } , Utilidades.ordenar( n1, n1-1, n1-2 ));
        }
    }

    @After
    public void tearDown(){
        // Aquí ponemos lo que deseamos ejecutar al finalizar cada test.
        // (Método vacío)
    }

}
