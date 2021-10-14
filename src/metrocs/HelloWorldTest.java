package metrocs;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

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
                  () -> assertEquals("Hello!", hW1.sayHello(null)));
    }
    
    @Test
    public void sayHelloUpperCaseTest() {
    	metrocs.HelloWorld hw1 = new metrocs.HelloWorld();
    	assertEquals("Hello WORLD", hw1.sayHello("WORLD"));
    }
    
    @Test
    public void sayHelloSymbolsTest() {
    	metrocs.HelloWorld hw1 = new metrocs.HelloWorld();
    	assertEquals("Hello !@#$%^&*", hw1.sayHello("!@#$%^&*"));
    }
    
    @Test 
    public void sayHelloLargeStringTest() {
    	metrocs.HelloWorld hw1 = new metrocs.HelloWorld();
    	int LARGE_LENGTH = (int)(1 * Math.pow(10,7));
    	char[] chars = new char[LARGE_LENGTH];
    	Arrays.fill(chars, 'a');
    	String large = new String(chars);
    	assertEquals(("Hello " + large), hw1.sayHello(large));
    }
}
