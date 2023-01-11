import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class SquareTest {

    @Test
     void isSquare() {
        assertFalse(Square.isSquare(-1));
        assertTrue(Square.isSquare(0));
        assertTrue(Square.isSquare(4));
        assertTrue(Square.isSquare(25));
    }
}