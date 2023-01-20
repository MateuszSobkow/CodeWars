import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {

    @Test
    void camelCase() {
    assertEquals("camel Casing", Solution.camelCase("camelCasing"));
    assertEquals("camel Casing Test", Solution.camelCase("camelCasingTest"));
    assertEquals("camelcasingtest", Solution.camelCase("camelcasingtest"));
    }
}