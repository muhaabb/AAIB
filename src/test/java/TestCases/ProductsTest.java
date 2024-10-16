package TestCases;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends TestBase {

    HomePage HomePageObject;
    ProductsPage ProductsPAgeObject;
    CartPage CartPageObject;
   @Test public void AddProductToCart (){
        HomePageObject = new HomePage(driver);
        HomePageObject.clickonProductsButton();
        ProductsPAgeObject = new ProductsPage(driver);
        ProductsPAgeObject.clickonViewProduct();
        ProductsPAgeObject.clickonAddToCart();
        ProductsPAgeObject.clickonViewCartLink();
        CartPageObject = new CartPage(driver);
Assert.assertEquals(CartPageObject.TotalPrice.getText(),"Rs. 400");


    }
}
