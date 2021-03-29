package Test_1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber(){
        Assert.assertEquals("The retult of getLocalNumber is not 14", 14, mainClass.getLocalNumber());
    }
}
