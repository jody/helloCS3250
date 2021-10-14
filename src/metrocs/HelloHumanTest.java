package metrocs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloHumanTest {
    // TODO: make test cases for HelloHumanTest
    @Test
    void helloHumanTest() {
        String expected = "Hello human";
        HelloHuman hello = new HelloHuman();
        assertEquals(expected, hello.sayHello("human"));
    }
    
    @Test
    void humanDesignationTest() {
        String expected = "Hello\nHUMAN_DESIGNATION = John";
        HelloHuman hello = new HelloHuman();
        assertEquals(expected, hello.sayHello("John"));
    }
}
