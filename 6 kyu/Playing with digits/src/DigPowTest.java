import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DigPowTest {

    @Test
    public void Test1() {
        assertEquals(1, DigPow.digPow2(89, 1));

    }
    @Test
    public void Test2() {
        assertEquals(-1, DigPow.digPow2(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, DigPow.digPow2(46288, 3));
    }
}