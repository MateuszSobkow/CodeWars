import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {

    private Kata kata = new Kata();

    @Test
    public void testExamples() {
        assertEquals(-110, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, kata.max(new int[]{5}));
    }
    @Test
    public void testExamples2() {
        assertEquals(-999, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110, -999}));
        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0, 3, 5, 10}));
        assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, kata.max(new int[]{5}));
    }
}