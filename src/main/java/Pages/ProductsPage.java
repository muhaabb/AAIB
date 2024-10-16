package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (css = "a[href='/product_details/2']")
    WebElement ViewProduct;
    @FindBy (xpath = "//button[normalize-space()='Add to cart']" )
    WebElement AddToCart;
    @FindBy (xpath ="//a[@href='/view_cart']")
    WebElement ViewCartLink;
             public void clickonViewProduct (){
        click(ViewProduct);
             }

    public void clickonAddToCart (){
        click(AddToCart);
    }

    public void clickonViewCartLink (){
        click(ViewCartLink);
    }

}
