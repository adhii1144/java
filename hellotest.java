import org.junit.*;

public class hellotest {
    @Test
    public void test1passed() {
        hello h = new hello();
        Assert.assertEquals("hello1", h.greet());
    }
}
