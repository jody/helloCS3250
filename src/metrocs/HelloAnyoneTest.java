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
    HelloAnyone hello;

    @Test
    void helloWorldTest(){
    	hello = new HelloAnyone();
    	String expected = "Hello world";
    	assertEquals(expected, hello.sayHello("world"));
    }
    
    @Test
    void specialHelloTest(){
    	hello = new HelloAnyone();
    	String expected = "A special hello to insertName";
    	assertEquals(expected, hello.sayHello("insertName"));
    }
}
