import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class EnoughIsEnoughTest {
        @Test
        public void test1() {
                assertEquals(Arrays.toString(new int[]{1, 2, 3, 1, 2, 3}), Arrays.toString(EnoughIsEnough.deleteNth(new int[]{1, 2, 3, 1, 2, 1, 2, 3}, 2)));

        }
}