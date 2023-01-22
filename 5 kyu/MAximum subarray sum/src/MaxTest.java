import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MaxTest {
    @Test
    public void test1(){

        assertEquals(6, Max.sequence(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(0, Max.sequence(new int[]{}));
    }
}