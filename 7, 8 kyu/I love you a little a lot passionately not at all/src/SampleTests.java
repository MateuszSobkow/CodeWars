import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import java.util.Random;

public class SampleTests {
    @Test
    public void test1() {
        assertEquals("I love you", Sid.howMuchILoveYou(1));
        assertEquals("a little", Sid.howMuchILoveYou(2));
        assertEquals("not at all", Sid.howMuchILoveYou(6));
    }
}