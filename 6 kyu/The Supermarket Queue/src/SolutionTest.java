import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {
    @Test
    public void test1(){
        assertEquals(9, Solution.solveSuperMarketQueue(new int[]{2,2,3,3,4,4}, 2));
    }
    @Test
    public void test2(){
        assertEquals(0, Solution.solveSuperMarketQueue(new int[]{}, 1));
    }
    @Test
    public void test3(){
        assertEquals(15, Solution.solveSuperMarketQueue(new int[]{1,2,3,4,5,}, 1));
    }
    @Test
    public void test4(){
        assertEquals(0, Solution.solveSuperMarketQueue(new int[]{0}, 0));
    }

}