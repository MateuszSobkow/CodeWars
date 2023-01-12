import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BouncingBallTest {
    @Test
    void test1(){
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }
   @Test
    void test2(){
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }

}