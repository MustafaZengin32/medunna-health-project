package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MustafaPage004 extends BasePage{


    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement dropDownmenu;

    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement mainPageLogo;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement signIn;


    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameInputBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(tagName = "h1")
    public WebElement welcomeAfterAdminSign;



}
