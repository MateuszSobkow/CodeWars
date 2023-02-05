import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ASumTest {
    @Test
    public void test1(){
        assertEquals(45, ASum.findNb(1071225));
        assertEquals(-1, ASum.findNb(91716553919377L));
    }
}