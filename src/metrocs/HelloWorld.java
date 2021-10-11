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
    } else if (toWhom == "usa") {
      return " USA is the most powerful country in the world";
    } else if ( len(toWhom) <= 4) {
      return " This is a string with length less than four";
    } else if ( len(toWhom) <= Integer.MAX_VALUE/4 ) {               
      try { return " This function can print a string with length a quarter of its maximum size";      
      }
      catch { return " String exceeds a quarter of its maximum size";     
      }
    }
    
    return "Hello " + toWhom;
  }
}
