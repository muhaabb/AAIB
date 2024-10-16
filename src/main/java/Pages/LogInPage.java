package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    // Constructor to initialize the driver for the Login page
    public LogInPage(WebDriver driver) {
        super(driver); // Ensure 'driver' is inherited from BasePage
    }

    // Locators for login elements
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement EmailField; // Renamed for clarity

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement PasswordField; // Renamed for clarity

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement LoginButton;



    @FindBy (xpath = "//li[10]//a[1]")
    public WebElement LoggedInMess;
    // Method to log in with provided credentials
    public void loginWithValidData(String userNameValue, String passwordValue) {
        setTextElementText(EmailField, userNameValue); // Set email field value
        setTextElementText(PasswordField, passwordValue); // Set password field value
        click(LoginButton); // Click the login button
    }
}
