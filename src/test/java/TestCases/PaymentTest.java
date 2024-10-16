package TestCases;

import Pages.HomePage;
import Pages.LogInPage;
import Pages.PaymentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends TestBase{
    PaymentPage PaymentPageObject;
    @Test(dataProvider = "CardData", dataProviderClass = Utilities.DataProviders.class)
    public void PayOrder (String NameOnCard , String CardNumber, String CVC , String Month , String Year){
        PaymentPageObject = new PaymentPage(driver);
        PaymentPageObject.CardData(NameOnCard,CardNumber,CVC,Month,Year);
        PaymentPageObject.ClickPay();
        Assert.assertEquals(PaymentPageObject.orderPlaced.getText(),"ORDER PLACED!");
    }
}
