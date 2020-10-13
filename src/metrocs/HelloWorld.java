package metrocs;
/**
 * Expansion of classic Hello World program
 * to support demonstration of unit testing.
 *
 * @author Dr. Jody Paul
 * @version 1.1.1
 */
public class HelloWorld {
  /**
   * Produces desired string on stdout.
   * @param args ignored
   */
  public static void main(final String[] args) {
    HelloWorld hw = new HelloWorld();
    System.out.println(hw.sayHello("world"));
  }

  /**
   * Constructs the greeting.
   * @param toWhom to whom the greeting is directed
   * @return the constructed greeting.
   */
  public String sayHello(final String toWhom) {
    if (toWhom == null) {
         return "Hello!";
    } else if (toWhom.equals("")) {
         return "Hello";
    }
    return "Hello " + toWhom;
  }
}
