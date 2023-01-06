import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RowSumOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
}