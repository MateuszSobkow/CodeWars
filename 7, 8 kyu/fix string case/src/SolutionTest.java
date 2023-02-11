import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {
    @Test
    public void test1(){
        assertEquals("COOD", Solution.solve("COOd"));
    }
    @Test
    public void test2(){
        assertEquals("cood", Solution.solve("COod"));
    }
    @Test
    public void test3(){
        assertEquals("cood", Solution.solve("cOod"));
    }
}