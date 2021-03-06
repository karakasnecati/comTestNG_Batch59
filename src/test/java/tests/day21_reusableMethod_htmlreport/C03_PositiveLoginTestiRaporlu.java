package tests.day21_reusableMethod_htmlreport;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilites.ConfigReader;
import utilites.Driver;
import utilites.TestBaseRapor;

public class C03_PositiveLoginTestiRaporlu extends TestBaseRapor {

    BrcPage brcPage = new BrcPage();


    @Test


    public void positiveLoginTest() {
        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilmeli");
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");
        //      login butonuna bas
        brcPage.ilkLoginButonu.click();
        extentTest.info("login butonuna tiklandi");
        // test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("Gecerli email yazildi");
        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        extentTest.info("Gecerli password yazildi");
        // login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        extentTest.info("login butonuna basildi");
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUsername= brcPage.kullaniciProfilIsmi.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);
        extentTest.pass("kullanici basarili sekilde giris yapti");
        Driver.closeDriver();
    }
}
