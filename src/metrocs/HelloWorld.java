package metrocs;
import java.time.LocalDate;
/**
 * Expansion of classic Hello World program
 * to support demonstration of unit testing.
 *
 * @author Dr. Jody Paul
 * @version 1.1.0
 */
public class HelloWorld {
  /**
   * Produces desired string on stdout.
   * @param args ignored
   */
  public static void main(final String[] args) {
    HelloWorld hw = new HelloWorld();
    LocalDate now = LocalDate.now();
    System.out.println(hw.sayHello("world") + "\n" + "Todays Date is:" + now );
  }

  /**
   * Constructs the greeting.
   * @param toWhom to whom the greeting is directed
   * @return the constructed greeting.
   */
  public String sayHello(String toWhom) {
    return "Hello " + toWhom;
  }
}

