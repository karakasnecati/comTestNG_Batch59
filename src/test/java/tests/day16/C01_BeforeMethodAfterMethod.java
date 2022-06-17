package tests.day16;

import org.testng.annotations.Test;
import utilites.TestBase;

public class C01_BeforeMethodAfterMethod extends TestBase {

    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
    }

}
