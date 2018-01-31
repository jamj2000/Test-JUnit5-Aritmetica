import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Ignore;
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


    @Test @Ignore   // Este test falla
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

    
    @Test @Ignore // Este test falla
    public void cobertura () {
        assertArrayEquals ("Caso 1, 2, 3", new int[]{1, 2, 3}, Utilidades.ordenar(1, 2, 3) );
        assertArrayEquals ("Caso 1, 3, 2", new int[]{1, 2, 3}, Utilidades.ordenar(1, 3, 2) );
        assertArrayEquals ("Caso 2, 1, 3", new int[]{1, 2, 3}, Utilidades.ordenar(2, 1, 3) );
        assertArrayEquals ("Caso 3, 2, 1", new int[]{1, 2, 3}, Utilidades.ordenar(3, 1, 2) ); 
        assertArrayEquals ("Caso 2, 3, 1", new int[]{1, 2, 3}, Utilidades.ordenar(2, 3, 1) );
        assertArrayEquals ("Caso 3, 2, 1", new int[]{1, 2, 3}, Utilidades.ordenar(3, 2, 1) );
        assertArrayEquals ("Caso 3, 1, 1", new int[]{1, 1, 3}, Utilidades.ordenar(3, 1, 1) ); // Este caso falla
        assertArrayEquals ("Caso 1, 1, 1", new int[]{1, 1, 1}, Utilidades.ordenar(1, 1, 1) );       

    }
  
}
