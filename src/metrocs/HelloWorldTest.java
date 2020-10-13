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
    public void unnecessaryTest() {
        assertNotNull(new metrocs.HelloWorld());
    }

    @Test
    public void groupedAssertionTest() {
        metrocs.HelloWorld hW1 = new metrocs.HelloWorld();
        assertAll("hello someone",
                  () -> assertEquals("Hello world", hW1.sayHello("world")),
                  () -> assertEquals("Hello", hW1.sayHello("")),
                  () -> assertEquals("Hello earth", hW1.sayHello("earth")),
                  () -> assertEquals("Hello!", hW1.sayHello(null)),
                  () -> assertEquals("Hello United States of America", hW1.sayHello("United States of America")));
                  () -> assertEquals("Hello Untied Kingdom", hW1.sayHello("United Kingdom")));
                  () -> assertEquals("Hello Colorado", hW1.sayHello("Colorado")));
                  () -> assertEquals("Hello Highway 285", hW1.sayHello("Highway 285")));
                  () -> assertEquals("Hello Rocky Mountains", hW1.sayHello("Rocky Mountains")));
                  () -> assertEquals("Hello 1200", hW1.sayHello("1200")));
                  () -> assertEquals("Hello !@#$%^&*()", hW1.sayHello("!@#$%^&*()")));
                  () -> assertEquals("Hello 100 West Pine Street, Denver CO", hW1.sayHello("100 West Pine Street, Denver CO")));
                  () -> assertEquals("Hello (insert name)", hW1.sayHello("(insert name)")));
                  () -> assertEquals("Hello 18 500", hW1.sayHello("18 500")));

    }

    @Test
    public void nonAsciiStringTest(){
	metrocs.HelloWorld h1 = new metrocs.HelloWorld();
	assertEquals("Hello இந்தியா", hw1.sayHello("இந்தியா"));
    }
}
