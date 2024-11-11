package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MustafaPage006 extends BasePage{

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenuIcon;

    @FindBy(xpath = "//a[contains(@href,'login')]")
    public WebElement dropdownSignInButton;

    @FindBy(xpath = "//a[contains(@href,'logout')]")
    public WebElement dropdownSignOutButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInUsernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signInPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement accountSettings;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[contains(text(),'language')]")
    public WebElement anyLanguageElementOnPage;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameTextBox;


}
