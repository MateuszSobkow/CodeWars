import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {

    @Test
    void test1() {
        assertEquals(9, Sid.simpleMultiplication(1));
    }
    @Test
    void test2() {
        assertEquals(27, Sid.simpleMultiplication(3));
    }
    @Test
    void test3() {
        assertEquals(189, Sid.simpleMultiplication(21));
    }
    @Test
    void test4() {
        assertEquals(207, Sid.simpleMultiplication(23));
    }

}