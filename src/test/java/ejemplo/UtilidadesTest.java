// José Antonio Muñoz Jiménez - Junio 2021
package ejemplo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

public class UtilidadesTest {
    // número de casos de prueba
    private int n; 
    // rango de números
    private int min;
    private int max;
    
    @BeforeAll
    public static void setUpClass() { 
        Utilidades u = new Utilidades ();   
    }
    
    @BeforeEach
    public void setUp() {
        // Aquí ponemos lo que deseamos ejecutar antes de iniciar cada test.
        n = 10; 
        min = -100;
        max =  100;
    }

    // 3 números iguales
    @Test
    public void testOrdenar3Iguales() {
        for (int i = 0 ; i < n ; i++ ) {
            int n1 = (int)Math.random()*(max - min) + min + 1;     
            assertArrayEquals( new int[]{ n1, n1, n1 } , Utilidades.ordenar( n1, n1, n1 ));
        }
    }

    // 2 números iguales
    @Test   // Este test falla con el método Utilidades.ordenar comentado 
    public void testOrdenar2Iguales() {
        for (int i = 0 ; i < n ; i++ ) {
            int n1 = (int)Math.random()*(max - min) + min + 1;
            assertArrayEquals( new int[]{ n1-3, n1, n1 } , Utilidades.ordenar( n1, n1, n1-3 ));
        }
    }

    // Números consecutivos
    @Test
    public void testOrdenarConsecutivos() {
        for (int i = 0 ; i < n ; i++ ) {
            int n1 = (int)Math.random()*(max - min) + min + 1;            
            assertArrayEquals( new int[]{ n1, n1+1, n1+2 } , Utilidades.ordenar( n1, n1+1, n1+2 ));
        }
    }

    // Números consecutivos en orden inverso
    @Test
    public void testOrdenarConsecutivosInverso() {
      for (int i = 0 ; i < n ; i++ ) {
            int n1 = (int)Math.random()*(max - min) + min + 1;            
            assertArrayEquals( new int[]{ n1-2, n1-1, n1 } , Utilidades.ordenar( n1, n1-1, n1-2 ));
        }
    }

    
    @Test  // Este test falla con el método Utilidades.ordenar comentado 
    public void cobertura () {
        assertArrayEquals ( new int[]{1, 2, 3}, Utilidades.ordenar(1, 2, 3) );
        assertArrayEquals ( new int[]{1, 2, 3}, Utilidades.ordenar(1, 3, 2) );
        assertArrayEquals ( new int[]{1, 2, 3}, Utilidades.ordenar(2, 1, 3) );
        assertArrayEquals ( new int[]{1, 2, 3}, Utilidades.ordenar(3, 1, 2) ); 
        assertArrayEquals ( new int[]{1, 2, 3}, Utilidades.ordenar(2, 3, 1) );
        assertArrayEquals ( new int[]{1, 2, 3}, Utilidades.ordenar(3, 2, 1) );
        assertArrayEquals ( new int[]{1, 1, 3}, Utilidades.ordenar(3, 1, 1) ); // Este caso falla
        assertArrayEquals ( new int[]{1, 1, 1}, Utilidades.ordenar(1, 1, 1) );       
    }
    
    @AfterEach
    public void tearDown(){
        // Aquí ponemos lo que deseamos ejecutar al finalizar cada test.
        // (Método vacío)
    }
  
}
