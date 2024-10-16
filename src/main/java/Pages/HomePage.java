package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage  {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//a[@href='/products']")
     WebElement  ProductsButton;
    @FindBy (xpath = "//a[normalize-space()='Cart']")
    WebElement CartButton;
    @FindBy (xpath = "//a[normalize-space()='Signup / Login']")
    WebElement LoginButton;
    public void clickonProductsButton (){
        click(ProductsButton);
    }
    public void clickonCartButton (){
        click(CartButton);
    }
    public void LoginButton (){
        click(LoginButton);
    }


}
