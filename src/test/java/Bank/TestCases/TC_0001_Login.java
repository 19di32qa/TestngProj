package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.LoginPage;

import org.testng.annotations.Test;

public class TC_0001_Login extends BaseClass {

    @Test
    public void loginTest() {
        LoginPage lp = new LoginPage(driver);
        lp.homePage(baseURL);
        lp.setUserName(userName);
        lp.setPassword(password);
        lp.submitClick();
    }
}