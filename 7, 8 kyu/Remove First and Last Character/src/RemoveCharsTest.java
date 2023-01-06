import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class RemoveCharsTest {
    @Test
    public void testRemoval(){
        Assertions.assertEquals("loquen", RemoveChars.remove("eloquent"));
        Assertions.assertEquals("ountr", RemoveChars.remove("country"));
        Assertions.assertEquals("erso", RemoveChars.remove("person"));
        Assertions.assertEquals("lac", RemoveChars.remove("place"));

    }


}