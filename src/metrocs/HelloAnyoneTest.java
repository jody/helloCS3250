package metrocs;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

/**
 * Tests for class HelloAnyone.
 *
 * @author CS3250 Fall 2021
 * @author Theo Crandall
 * @version 1.0
 */
public class HelloAnyoneTest {
    
    // Tests with null input
    @Test
    public void sayHelloNULL() {
        HelloAnyone ha = new HelloAnyone();
        assertEquals("Hello!", ha.sayHello(null));
    }

    // Test with an empty string
    @Test
    public void sayHelloEmpty() {
        HelloAnyone ha = new HelloAnyone();
        assertEquals("A special hello to ", ha.sayHello(""));
    }

    // Test saying hello to "CS3250"
    @Test
    public void sayHelloCS3250() {
        HelloAnyone ha = new HelloAnyone();
        assertEquals("A special hello to CS3250", ha.sayHello("CS3250"));
    }

    // Test saying hello to "world"
    @Test
    public void sayHelloWorld() {
        HelloAnyone ha = new HelloAnyone();
        assertEquals("Hello world", ha.sayHello("world"));
    }
}
