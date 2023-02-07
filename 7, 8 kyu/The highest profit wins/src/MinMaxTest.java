import org.junit.Before;
import org.testng.annotations.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class MinMaxTest {
    Random rand;

    @Before
    public void initTest() {
        rand = new Random();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 5}, MinMax.minMax(new int[]{1, 2, 3, 4, 5}));
    }
}