package metrocs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        metrocs.HelloAnyone hA = new metrocs.HelloAnyone();
        assertEquals("Hello world", hA.sayHello("world"));
        assertEquals("A special hello to earth", hA.sayHello("earth"));
    }
    
    /** null test 
    @Test
    public void sayHelloNullTest() {
        metrocs.HelloAnyone hA = new metrocs.HelloAnyone();
        assertEquals("Hello!", hA.sayHello(null));      
    }
    
    /** Empty string test
    @Test
    public void sayHelloWorldTest() {
         metrocs.HelloAnyone hA = new metrocs.HelloAnyone();
        assertEquals("Hello World", hA.sayHello("World"));
    } */
    
    /** other test
    @Test
    public void sayHelloNormalTest() {
         metrocs.HelloAnyone hA = new metrocs.HelloAnyone();
        assertEquals("A special hello to Robert", hA.sayHello("Robert));
    } */
    
            
}
