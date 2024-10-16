package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
static WebDriver driver;
public BasePage (WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver ,this);
}

 static void click (WebElement element ){
    element.click();
}

protected static void setTextElementText (WebElement textelement, String value) {
    textelement.sendKeys(value);
}

public void selectFromMenu (WebElement element , String text){
    Select objSelect = new Select(element);
    objSelect.selectByValue(text);
}

public void selectCheckBox (WebElement element){
    element.click();
}

}
