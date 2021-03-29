package Test_2;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("getClassNumber return value is not grater than 45", mainClass.getClassNumber() > 45);
    }
}
