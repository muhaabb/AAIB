
package TestCases;

import Pages.HomePage;
import Pages.LogInPage;
import Utilities.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homeObj;
    LogInPage loginObj;

@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
    public void LoginWithValidCredentials(String UserName, String Password) {
        homeObj = new HomePage(driver);
        homeObj.LoginButton();
        loginObj = new LogInPage(driver);
        loginObj.loginWithValidData(UserName, Password);
       String LoginMess = loginObj.LoggedInMess.getText();
    System.out.println(LoginMess);
    Assert.assertEquals(loginObj.LoggedInMess.getText(),"Logged in as muhab");
    }



}
