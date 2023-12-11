package aritmetica;

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

