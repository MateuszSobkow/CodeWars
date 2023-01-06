import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TrianagleTesterTest {

    @Test
    void isTriangle() {
        assertEquals(true, TriangleTester.isTriangle(1,2,2));
        assertEquals(false, TriangleTester.isTriangle(7,2,2));

    }
}