import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SolutionTest {
    @Test
    void sampleTest() {
        assertEquals("SSttrriinngg",Solution.doubleChar("String"));
        assertEquals("HHeelllloo  WWoorrlldd",Solution.doubleChar("Hello World"));
        assertEquals("11223344!!__  ",Solution.doubleChar("1234!_ "));
    }
}
