import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LongestConsecTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
        testing(LongestConsec.longestConsec2(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
        testing(LongestConsec.longestConsec2(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
        testing(LongestConsec.longestConsec2(new String[] {}, 3), "");
        testing(LongestConsec.longestConsec2(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        testing(LongestConsec.longestConsec2(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
        testing(LongestConsec.longestConsec2(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
        testing(LongestConsec.longestConsec2(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
        testing(LongestConsec.longestConsec2(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
        testing(LongestConsec.longestConsec2(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
    }
}