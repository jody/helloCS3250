package metrocs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Tests for class HelloAnyone.
 *
 * @author  CS3250 Fall 2021
 * @version 1.0
 */
public class HelloAnyoneTest {

    @Test
    public void HelloAnyoneContent()
    {
        metrocs.HelloAnyone sh = new metrocs.HelloAnyone();
        assertEquals("A special hello to world", sh.sayHello("world"));
        assertEquals("A special hello to Nicoland", sh.sayHello("Nicoland"));
    }

    @Test
    public void HelloAnyoneEmpty()
    {
        metrocs.HelloAnyone sh = new metrocs.HelloAnyone();
        assertEquals("A special hello to", sh.sayHello(""));
        assertEquals("A special hello to ", sh.sayHello(" "));
    }
}
