package metrocs;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for class HelloAnyone.
 *
 * @author  Connor Meek
 * @version 1.0
 */
public class HelloAnyoneTest {
    @Test
    public void sayHelloTest(){
        metrocs.HelloAnyone Ha1 = new metrocs.HelloAnyone();
        assertEquals("A special hello to World", Ha1.sayHello("World"));
        assertEquals("Hello!", Ha1.sayHello(null));
        assertEquals("Hello world", Ha1.sayHello("world"));
    }

    @Test
    public void HelloAnyoneLowerCaseTest(){
        metrocs.HelloAnyone Ha1 = new metrocs.HelloAnyone();
        assertEquals("Hello world", Ha1.sayHello("world"));
    }

    @Test
    public void HelloAnyoneMinLength(){
        metrocs.HelloAnyone Ha1 = new metrocs.HelloAnyone();
        assertEquals("A special hello to ", Ha1.sayHello(""));
    }
}
