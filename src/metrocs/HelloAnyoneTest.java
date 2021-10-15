package metrocs;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Tests for class HelloAnyone.
 *
 * @author  CS3250 Fall 2021
 * @version 1.0
 */
public class HelloAnyoneTest {
    //TODO: Write tests for HelloAnyone
     @Test
    public void sayHelloBasicsTest() {
        metrocs.HelloAnyone hA1 = new metrocs.HelloAnyone();
        assertEquals("Hello world", hA1.sayHello("world"));
        assertEquals("Hello earth", hA1.sayHello("earth"));
        assertEquals("Hello Bill", hA1.sayHello("Bill"));
    }
    @Test
    public void sayHelloEmptyStringTest() {
        metrocs.HelloAnyone hA1 = new metrocs.HelloAnyone();
        assertEquals("Hello", hA1.sayHello(""));
    }

    @Test
    public void sayHelloNullTest() {
        metrocs.HelloAnyone hA1 = new metrocs.HelloAnyone();
        assertEquals("Hello!", hA1.sayHello(null));
    }

    @Test
    public void unnecessaryTest() {
        assertNotNull(new metrocs.HelloAnyone());
    }

    @Test
    public void groupedAssertionTest() {
        metrocs.HelloAnyone hA1 = new metrocs.HelloAnyone();
        assertAll("hello someone",
                  () -> assertEquals("Hello world", hA1.sayHello("world")),
                  () -> assertEquals("Hello", hA1.sayHello("")),
                  () -> assertEquals("Hello earth", hA1.sayHello("earth")),
                  () -> assertEquals("Hello!", hA1.sayHello(null)));
    }
}
