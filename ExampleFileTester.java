import static org.junit.Assert.*;
import org.junit.*;

public class ExampleFileTester {
    @Test
    public void testCombine() {
        // Expected: "Hello World", Result: "HelloWorld"
        assertEquals("Hello World", ExampleFile.combine("Hello", "World"));
    }
}
