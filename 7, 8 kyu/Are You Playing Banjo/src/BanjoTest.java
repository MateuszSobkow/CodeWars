import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class BanjoTest {
    @Test
    public void test1(){
        assertEquals("Roberto plays banjo",Banjo.areYouPlayingBanjo2("Roberto"));
        assertEquals("Rafael plays banjo",Banjo.areYouPlayingBanjo2("Rafael"));
        assertEquals("Matt does not play banjo",Banjo.areYouPlayingBanjo2("Matt"));

    }
    @Test
    public void test2(){
        assertEquals( "Nope!", "Martin does not play banjo", Banjo.areYouPlayingBanjo2("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", Banjo.areYouPlayingBanjo2("Rikke"));
        assertEquals( "Nope! Remember lower case counts, too!", "rolf plays banjo", Banjo.areYouPlayingBanjo2("rolf"));
        assertEquals( "Nope!", "bravo does not play banjo", Banjo.areYouPlayingBanjo2("bravo"));
    }

}