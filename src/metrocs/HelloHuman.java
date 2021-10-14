package metrocs;

/**
 * Extension that demonstrates inheritence and method override.
 *
 * @author: Robert Beer
 * @version: 1.0
 */
public class HelloHuman extends HelloWorld {
 /*****************************************************************************
  *    Title: HelloAnyone.java
  *    Author: Dr. Paul, J
  *    Date: 2021
  *    Code version: 1.0
  *    Availability: https://github.com/jody/helloCS3250/blob/master/src/metrocs/HelloAnyone.java
  *
  ****************************************************************************/

  /**
   * Produces a greeting on stdout.
   * @param args ignored
   */


    public static void main(final String[] args) {
        HelloHuman he = new HelloHuman();
        if (args.length == 0) {
            System.out.println(he.sayHello("human"));
        } else {
            System.out.println(args[0]);
        }
    }
    /**
     * Overridden method from parent
     */

    /**************************************************************************
     *    Title: HelloAnyone.java
     *    Author: Dr. Paul, J
     *    Date: 2021
     *    Code version: 1.0
     *    Availability: https://github.com/jody/helloCS3250/blob/master/src/metrocs/HelloAnyone.java
     *
     *************************************************************************/

    @Override
    public String sayHello(final String toWhom) {
        String response = "";
        if (toWhom == null || toWhom.equals("human")) {
            response = super.sayHello("human");
        } else if (toWhom.equals("") || toWhom.equals(" ")) {
            response = "ERROR: NO DESIGNATION GIVEN";
        } else {
            response = "Hello\n" + "USER_DESIGNATION = " + toWhom;
        }
        return response;
    }
}

