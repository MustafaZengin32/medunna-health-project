package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MustafaPage002 extends BasePage{

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement dropDownmenu;

    @FindBy(xpath = "//a[@href='/account/register']")
    public WebElement registerButton;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;
    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstNameTextBox;
    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement lastNameTextBox;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userNameTextBox;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailTextBox;
    @FindBy(xpath = "//*[@id='firstPassword']")
    public WebElement firstPasswordTextBox;
    @FindBy(xpath = "//*[@id='secondPassword']")
    public WebElement secondPasswordTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//*[@id='register-form']/div[5]/div")
    public WebElement yourEmailIsRequiredMessage;
    @FindBy(xpath = "//*[@id='register-form']/div[4]/div")
    public WebElement usernameIsRequiredMessage;
    @FindBy(xpath = "//*[@id='register-form']/div[5]/div")
    public WebElement thisFieldIsInvalidMessage;
}
