package quruqa.com.simpletests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("simple")
@Epic("My Epic")
@Feature("My Feature")
@Story("My Story")
public class PositiveTests {

    @Test
    void someTest1() {
        Assertions.assertTrue(true);
    }

    @Test
    void someTest2() {
        Assertions.assertTrue(true);
    }

    @Test
    void someTest3() {
        Assertions.assertTrue(true);
    }
}
