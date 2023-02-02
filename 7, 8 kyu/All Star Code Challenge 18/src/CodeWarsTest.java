import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CodeWarsTest {
    @Test
    public void test1(){
        assertEquals("Expected 1: 'Hello' 'H' ",1,CodeWars.strCount("Hello", 'H'));
        assertEquals("Expected 2: 'Hello' 'l' ",2,CodeWars.strCount("Hello", 'l'));
        assertEquals("Expected 0: 'Hello' 'z' ",0,CodeWars.strCount("", 'z'));
    }
}