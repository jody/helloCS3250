package metrocs;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
//Removed unused import

import org.junit.jupiter.api.Test;

/**
 * Tests for class HelloWorld.
 *
 * @author  Dr. Jody Paul
 * @version 1.1.0
 */
public class HelloWorldTest {
	
	//Added a global variable to reduce line count.
	metrocs.HelloWorld hW1 = new metrocs.HelloWorld();
	
    @Test
    public void sayHelloBasicsTest() {
        assertEquals("Hello world", hW1.sayHello("world"));
        assertEquals("Hello earth", hW1.sayHello("earth"));
    }

    @Test
    public void sayHelloEmptyStringTest() {
        assertEquals("Hello", hW1.sayHello(""));
    }

    @Test
    public void sayHelloNullTest() {
        assertEquals("Hello!", hW1.sayHello(null));
    }

    @Test
    public void unnecessaryTest() {
        assertNotNull(new metrocs.HelloWorld());
    }

    @Test
    public void groupedAssertionTest() {
        assertAll("hello someone",
                  () -> assertEquals("Hello world", hW1.sayHello("world")),
                  () -> assertEquals("Hello", hW1.sayHello("")),
                  () -> assertEquals("Hello earth", hW1.sayHello("earth")),
                  () -> assertEquals("Hello!", hW1.sayHello(null)));
    }
}
