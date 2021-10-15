package metrocs;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Tests for class HelloWorld.
 *
 * @author  Dr. Jody Paul
 * @version 1.1.1
 */
public class HelloWorldTest {
    @Test
    public void sayHelloBasicsTest() {
        metrocs.HelloWorld hW1 = new metrocs.HelloWorld();
        assertEquals("Hello world", hW1.sayHello("world"));
        assertEquals("Hello earth", hW1.sayHello("earth"));
    }

    @Test
    public void sayHelloEmptyStringTest() {
        metrocs.HelloWorld hW1 = new metrocs.HelloWorld();
        assertEquals("Hello", hW1.sayHello(""));
    }

    @Test
    public void sayHelloNullTest() {
        metrocs.HelloWorld hW1 = new metrocs.HelloWorld();
        assertEquals("Hello!", hW1.sayHello(null));
    }

    @Test
    public void groupedAssertionTest() {
        metrocs.HelloWorld hW1 = new metrocs.HelloWorld();
        assertAll("hello someone",
                  () -> assertEquals("Hello world", hW1.sayHello("world")),
                  () -> assertEquals("Hello", hW1.sayHello("")),
                  () -> assertEquals("Hello earth", hW1.sayHello("earth")),
                  () -> assertEquals("Hello!", hW1.sayHello(null)));
    }
}
