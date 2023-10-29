package String;

import org.junit.*;

public class stringtest {
    @Test
    public void testcase() {
        string sc = new string();
        Assert.assertEquals("HEllo", sc.hello());
    }
}
 