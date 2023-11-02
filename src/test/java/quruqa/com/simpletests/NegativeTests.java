package quruqa.com.simpletests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("simple")
public class NegativeTests {

    @Test
    void someTest1() {
        Assertions.assertTrue(false);
    }

    @Test
    void someTest2() {
        Assertions.assertTrue(false);
    }

    @Test
    void someTest3() {
        Assertions.assertTrue(false);
    }
}
