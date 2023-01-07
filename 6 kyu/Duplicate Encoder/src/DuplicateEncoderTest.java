import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class DuplicateEncoderTest {

    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}