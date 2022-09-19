package google.hello.world;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldControllerUnitTests {
    @Test
    public void testHelloWorld() {
        HelloWorldController hwc = new HelloWorldController();
        assertEquals("hello world", hwc.HelloWorld());
    }
}
