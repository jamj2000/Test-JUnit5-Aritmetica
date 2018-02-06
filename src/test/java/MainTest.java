import org.junit.Test;
import static org.junit.Assert.*;


public class MainTest {

  @Test
  public void testMain() {
      // fail();  // Establecemos que este test falle 
      Main m = new Main();
      Main.main(new String[]{});
  }

}

