import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {
    @Test
    public void test1(){
        assertEquals("4547-9-3", Solution.insertDash2(454793));
        assertEquals("123456", Solution.insertDash2(123456));
        assertEquals("1003-567", Solution.insertDash2(1003567));
    }

}