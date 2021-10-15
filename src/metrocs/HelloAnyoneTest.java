package metrocs;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

/**
 * Tests for class HelloAnyone.
 *
 * @author: Brandon DeRosier  CS3250 Fall 2021
 * @version 1.0
 */
public class HelloAnyoneTest {

    private HelloAnyone greeting;
    @Test
    void AnyoneNameTest() {
        greeting = new HelloAnyone();
        String expected = "A special hello to George";
        String actual = greeting.sayHello("George");
        Assert.assertEquals(expected, actual);
    }

}
