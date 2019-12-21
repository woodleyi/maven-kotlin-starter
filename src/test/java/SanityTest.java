import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SanityTest {
    @Test
    public void testing() {
        final MyClass myClass = new MyClass(12345);
        assertEquals(12345, myClass.getX());
    }
}
