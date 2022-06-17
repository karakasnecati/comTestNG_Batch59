package tests.day21_reusableMethod_htmlreport;

import org.testng.annotations.Test;
import utilites.ConfigReader;
import utilites.Driver;
import utilites.ReusableMethods;

import java.io.IOException;

public class C02_ScrenShotReusableMethod {

    @Test
    public void test01() throws IOException {
        // amazon sayfasina gidip fotografini cekelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");
        Driver.closeDriver();
    }
}
