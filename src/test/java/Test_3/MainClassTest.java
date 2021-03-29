package Test_3;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetClassString() {
        Assert.assertTrue("hello or Hello substrings are not found in getClassString return value",
                mainClass.getClassString().contains("Hello".toLowerCase()));
    }
}
