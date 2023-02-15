import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {

    @Test
    public void predictAge() {
        assertEquals(86, Solution.predictAge(65, 60, 75, 55, 60, 63, 64, 45));
    }
}