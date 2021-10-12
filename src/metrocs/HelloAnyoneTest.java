package metrocs;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for class HelloAnyone.
 *
 * @author  CS3250 Fall 2021
 * @version 1.0
 */
public class HelloAnyoneTest {
    @Test
    public void sayHelloBasicsTest() {
        metrocs.HelloAnyone hA = new metrocs.HelloAnyone();
        assertEquals("Hello world", hA.sayHello("world"));
    }
}
