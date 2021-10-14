package metrocs;
import org.junit.jupiter.api.Test;

/**
 * Tests for class HelloAnyone.
 *
 * @author  CS3250 Fall 2021
 * @version 1.0
 */
public class HelloAnyoneTest {
    //TODOd: Write tests for HelloAnyone
     @Test
     public void sayHelloBasicsTest() {
         metrocs.HelloAnyone ha1 = new metrocs.HelloAnyone();
         assertEquals("A special welcome to world.", ha1.sayHello("world"));
         assertEquals("A special welcome to earth.", ha1.sayHello("earth"));

    }

    @Test
    public void helloEveryoneEmptyString() {
        metrocs.HelloAnyone ha1 = new metrocs.HelloAnyone();
        assertEquals("Hello world", ha1.sayHello(""));
    }
}
