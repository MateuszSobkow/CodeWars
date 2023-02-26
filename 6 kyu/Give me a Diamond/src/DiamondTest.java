import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DiamondTest {
    @Test
    public void test1(){
        String expected =
                "  *\n" +
                " ***\n" +
                "*****\n" +
                " ***\n" +
                "  *\n";
        assertEquals(expected, Diamond.print(5));
    }
}