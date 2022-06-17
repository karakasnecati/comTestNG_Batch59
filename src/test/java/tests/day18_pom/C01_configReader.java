package tests.day18_pom;

import org.testng.annotations.Test;
import utilites.ConfigReader;
import utilites.Driver;

public class C01_configReader {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));



    }
}
