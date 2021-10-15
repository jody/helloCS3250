package metrocs;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests for class HelloAnyone.
 *
 * @author Quin Mullen
 * @version 1.0
 */
public class HelloAnyoneTest {
    @Test
    public void HelloAllTest() {
        metrocs.HelloAnyone HeA = new metrocs.HelloAnyone();
        assertEquals("A special hello to World", HeA.sayHello("World"));
        assertEquals("Hello!", HeA.sayHello(null));
        assertEquals("Hello world", HeA.sayHello("world"));
    }
    @Test
    public void HelloMinimumLength() {
        metrocs.HelloAnyone HeA = new metrocs.HelloAnyone();
        assertEquals("A special hello to ", HeA.sayHello(""));
    }
}
