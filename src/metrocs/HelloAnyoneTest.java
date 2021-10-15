package metrocs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Tests for class HelloAnyone.
 *
 * @author  CS3250 Fall 2021
 * @version 1.0
 */
public class HelloAnyoneTest {
    @Test
    public void helloAnyoneBasicTest() {
        metrocs.HelloAnyone test = new metrocs.HelloAnyone();
        assertEquals("A special hello to you", test.sayHello("you"));
    }

    @Test
    public void helloAnyoneEmptyStringTest() {
        metrocs.HelloAnyone test = new metrocs.HelloAnyone();
        assertEquals("Hello!", test.sayHello(null));
    }

    @Test
    public void helloAnyoneWorldStringTest() {
        metrocs.HelloAnyone test = new metrocs.HelloAnyone();
        assertEquals("Hello world", test.sayHello("world"));
    }
}
