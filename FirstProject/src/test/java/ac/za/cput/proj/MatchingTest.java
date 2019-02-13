package ac.za.cput.proj;

import org.junit.Assert;
import org.junit.Test;

public class MatchingTest {
    @Test
    public void calculate(){
        Matching match = new Matching();

        Assert.assertEquals(3, match.divide(15,5));
    }
    @Test
    public void seeNames(){
        Matching match = new Matching();

        Assert.assertEquals("TinaKabai", match.names("Tina", "Kabai"));
    }
}
