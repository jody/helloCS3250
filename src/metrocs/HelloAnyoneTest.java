package metrocs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Tests for class HelloAnyone.
 *
 * @(HelloWorldTest.java (@Jody))
 * @author  Adriana Miller CS3250 Fall 2021
 * @version 2.0
 */
public class HelloAnyoneTest {
    //TODO: Write tests for HelloAnyone
    @Test
    public void testSayHello() {
        metrocs.HelloAnyone ha1 = new metrocs.HelloAnyone();
        toWhom.equals("Earth");
        assertEquals(response, "A special hello to Earth");
    }
    
    @Test
    public void baseTest() {
        metrocs.HelloAnyone ha1 = new metrocs.HelloAnyone();
        assertEquals(ha1.sayHello, "world");
        assertEquals("Hello world", ha1.sayHello("world"));
        assertEquals("Hello Gary", ha1.sayHello("Gary"));
    }

    @Test
    public void testNotNeeded() {
        metrocs.HelloAnyone ha1 = new metrocs.HelloAnyone();
        assertNotNull( new metrocs.HelloAnyone());
    }
    
    @Test
    public void emptyString() {
        metrocs.HelloAnyone ha1 = new metrocs.HelloAnyone();
        assertNEquals("Hello", ha1.sayHello(""));
    }
}
