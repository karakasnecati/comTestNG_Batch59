package tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilites.ConfigReader;
import utilites.Driver;

public class C02 {

    @Test
    public void test01() {
        FacebookPage facebookPage=new FacebookPage();
        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        // cikarsa cookies kabul edin
        //facebookPage.cookieButonu.click();
        // kullanici mail kutusuna yanlis kullanici ismi yazdirin
        facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUsername"));
        // kullanici sifre kutusuna yanlis password yazdirin
        facebookPage.sifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongPassword"));
        // login butonuna basin
        facebookPage.loginTusu.click();
        // giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
        // sayfayi kapatin
        Driver.closeDriver();
    }
}
