package metrocs;
/**
 * Extension to support demonstration of inheritance.
 *
 * @author Dr. Jody Paul
 * @version 1.0
 */
public class HelloAnyone extends HelloWorld {
  /**
   * Produces a greeting on stdout.
   * @param args ignored
   */
  public static void main(final String[] args) {
    HelloAnyone ha = new HelloAnyone();
    if (args.length == 0) {
        System.out.println(ha.sayHello("world"));
    } else {
        System.out.println(ha.sayHello(args[0]));
    }
  }

  /**
   * Demonstrate overriding.
   */
  @Override
  public String sayHello(final String toWhom) {
    String response = "";
    if (toWhom == null || toWhom.equals("world")) {
      response = super.sayHello(toWhom);
    } else {
      response = "A special hello to " + toWhom;
    }
    return response;
  }          
}
