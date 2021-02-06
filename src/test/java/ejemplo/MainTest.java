// José Antonio Muñoz Jiménez - Junio 2021
package ejemplo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

  @Test
  public void testMain() {
      // fail();  // Establecemos que este test falle 
      Main m = new Main();
      Main.main(new String[]{});
  }

}

