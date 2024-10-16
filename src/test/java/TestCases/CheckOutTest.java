package TestCases;

import Pages.CartPage;
import org.testng.annotations.Test;

@Test
public class CheckOutTest extends TestBase{
    CartPage CartPageObject;
    public void PlaceOrder (){
        CartPageObject = new CartPage(driver);
        CartPageObject.ProceedToCheckOutButton();
        CartPageObject.ClickOnPlaceOrder();
    }
}
