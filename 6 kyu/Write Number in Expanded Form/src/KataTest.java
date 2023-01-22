import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KataTest {
    @Test
    public void test1(){
        assertEquals("10 + 2", Kata.expandedForm(12));
        assertEquals("40 + 2", Kata.expandedForm(42));
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
        assertEquals("2000000000 + 1", Kata.expandedForm(2000000001));
    }

}