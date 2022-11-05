package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_0004_Login_invalidPassword extends BaseClass {

    @Test(groups = {"Login/logout"})
    public void invalidPasswordTest() {
        LoginPage lp = new LoginPage(driver);
        String invalidPassword = "failed";
        lp.homePage(baseURL);
        lp.setUserName(userName);
        lp.setPassword(invalidPassword);
        lp.submitClick();
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getTitle(), "GTPL Bank Home Page");
        lp.closeDriver();
    }

}
