import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SumTest {
    Sum s = new Sum();
    @Test
    public void test1(){
        assertEquals(1, s.GetSum(1, 0));
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(2, s.GetSum(-1, 2));
    }
}