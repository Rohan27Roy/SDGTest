package witaas_Selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class sel1test {


    @Test public void sel1Test() {
        sel1 sl = new sel1();
        assertTrue(sl.sel2().equals("1"));
    }
}
