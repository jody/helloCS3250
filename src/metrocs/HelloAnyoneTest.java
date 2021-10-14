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
    HelloWorld hello;

    @Test
    void helloWorldTest(){
    	hello = new HelloWorld();
    	String expected = "Hello world";
    	assertEquals(expected, hello.sayHello("world"));
    }
}
