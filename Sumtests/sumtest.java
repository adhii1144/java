package Sumtests;

import org.junit.*;

//import org.junit.jupiter.api.Assertiopns;
public class sumtest {

    @Test
    public void testcase() {
        sum s = new sum();
        Assert.assertEquals(10, s.add(10, 0));
    }

    @Test
    public void test() {
        sum2 sc = new sum2();
        Assert.assertEquals(15, sc.add(10, 5));
    }

    @Test
    public void test5() {
        sum2test se = new sum2test();
        Assert.assertEquals(98, se.testcase());
    }
}
