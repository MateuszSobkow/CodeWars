import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RevRotTest {
    @Test
    public void test1(){
        assertEquals("234561876549", RevRot.revRot("123456987654", 6));
    }
}