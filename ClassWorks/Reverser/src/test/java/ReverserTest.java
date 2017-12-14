import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverserTest {
    @Test
    public void reverseTest() {
        Assert.assertEquals("asdf", Reverser.reverse("fdsa"));
    }
}