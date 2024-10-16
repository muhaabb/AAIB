package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    public static WebDriver driver;


    @BeforeTest

    public void OpenBrowser (){
        driver = new ChromeDriver();
        driver.manage();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
  // @AfterTest
   //public void CloseBrowser (){
    //driver.quit();
    }

