package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class BrcPage {
    public BrcPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciLoginButonu;

    @FindBy (xpath = "//button[@type='submit']")

    public WebElement kullaniciProfilIsmi;


}
