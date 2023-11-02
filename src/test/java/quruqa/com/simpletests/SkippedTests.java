package quruqa.com.simpletests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("simple")
public class SkippedTests {

    @Test
    @Disabled
    void someTest1() {
        Assertions.assertTrue(false);
    }

    @Test
    @Disabled
    void someTest2() {
        Assertions.assertTrue(false);
    }

    @Test
    @Disabled
    void someTest3() {
        Assertions.assertTrue(false);
    }
}
