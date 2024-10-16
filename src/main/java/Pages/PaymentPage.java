package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {
    @FindBy (xpath = "//input[@name='name_on_card']")
    WebElement NameOnCard;
    @FindBy (xpath = "//input[@name='card_number']")
    WebElement CardNumber;
    @FindBy (xpath = "//input[@name='cvc']")
    WebElement CCVNUM;
    @FindBy (xpath = "//input[@name='expiry_month']")
    WebElement ExpiaryMonth;
    @FindBy (xpath = "//input[@name='expiry_year']")
    WebElement ExpiaryYear;
    @FindBy (xpath = "//button[@id='submit']")
    WebElement Pay;
    @FindBy (xpath = "//b[normalize-space()='Order Placed!']")
  public   WebElement orderPlaced;
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public void CardData(String Name,String Number,String CVC, String Month, String Year ) {
        setTextElementText(NameOnCard, Name);
        setTextElementText(CardNumber, Number);
        setTextElementText(CCVNUM, CVC);
        setTextElementText(ExpiaryMonth, Month);
        setTextElementText(ExpiaryYear, Year);

    }
    public void ClickPay (){
        click(Pay);
    }
}
