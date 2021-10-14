package metrocs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloHumanTest {

    @Test
    void helloHumanTest() {
        String expected = "Hello human";
        HelloHuman hello = new HelloHuman();
        assertEquals(expected, hello.sayHello("human"));
    }

    @Test
    void humanDesignationTest() {
        String expected = "Hello\nUSER_DESIGNATION = John";
        HelloHuman hello = new HelloHuman();
        assertEquals(expected, hello.sayHello("John"));
    }

    @Test
    void noDesignationTest() {
        HelloHuman hello = new HelloHuman();
        String expected = "ERROR: NO DESIGNATION GIVEN";
        assertEquals(expected, hello.sayHello(""));
        assertEquals(expected, hello.sayHello(" "));
    }
}
