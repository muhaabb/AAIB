package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Pages.BasePage.click;

public class CartPage extends BasePage{
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement ProceedToCheckOutButton;

@FindBy (xpath = "//p[@class='cart_total_price']")
public  WebElement TotalPrice;
@FindBy (xpath = "//a[normalize-space()='Place Order']")
WebElement PlaceOrder;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void ProceedToCheckOutButton (){
        click(ProceedToCheckOutButton);
    }

    public void ClickOnPlaceOrder () {
        click(PlaceOrder);
    }

}
