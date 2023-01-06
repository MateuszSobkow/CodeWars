import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @Test
    void test1() {
        assertEquals(78708000, Clock.Past(21, 51 ,48));

    }
}