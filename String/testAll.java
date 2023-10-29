package String;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Sumtests.sumtest;
import Sumtests.sum2test;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        hellotest.class,
        stringtest.class,
        sumtest.class,
// sum2test.class
})
public class testAll {
    // These class will be empty
}
