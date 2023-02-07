

// TODO: Replace examples and use TDD by writing your own tests

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SampleTest {

    private static void doTest(String str, String expected) {
        assertEquals(expected, Kata.incrementString(str));
    }

    @Test
    public void exampleTests() {
        doTest("foobar000", "foobar001");
        doTest("foo", "foo1");
        doTest("foobar001", "foobar002");
        doTest("foobar99", "foobar100");
        doTest("foobar099", "foobar100");
        doTest("", "1");
    }
}