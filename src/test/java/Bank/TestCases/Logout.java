package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.ManagerHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends BaseClass {

    @Test(groups = {"Login/logout"})
    public void logOutTest() {
        ManagerHomePage mp = new ManagerHomePage(driver);
        mp.navigateToMangerPage(mp.managerPageURL);
        mp.getLogOutLink().click();
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getTitle(), "GTPL Bank Home Page");
    }
}
