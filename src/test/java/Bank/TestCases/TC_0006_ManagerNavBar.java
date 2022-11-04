package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.ManagerHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_0006_ManagerNavBar extends BaseClass {


    @Test(priority = 1)
    public void newCustomerLinkIsVisibleTest() {
        ManagerHomePage mp = new ManagerHomePage(driver);
        mp.navigateToMangerPage(mp.managerPageURL);
        //log.info(driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).getAttribute("href"));
        log.info("test 1");
        Assert.assertEquals(mp.getAddCustomerHref(),"https://demo.guru99.com/V1/html/addcustomerpage.php");
        Assert.assertTrue(mp.getAddCustomerLink().isDisplayed());
        Assert.assertTrue(mp.getAddCustomerLink().isEnabled());
    }
    @Test (priority = 2)
    public void editCustomerLinkVisibleTest() {
        ManagerHomePage mp = new ManagerHomePage(driver);
        log.info("test 2");
        mp.navigateToMangerPage(mp.managerPageURL);
        Assert.assertEquals(mp.getEditCustomerHref(),"https://demo.guru99.com/V1/html/EditCustomer.php");
        Assert.assertTrue(mp.getEditCustomerLink().isDisplayed());
        Assert.assertTrue(mp.getEditCustomerLink().isEnabled());

    }
    @Test (priority = 3, enabled = false)
    public void deleteCustomerLinkVisibleTest() {
        ManagerHomePage mp = new ManagerHomePage(driver);
        log.info("test 3");
        mp.navigateToMangerPage(mp.managerPageURL);
        Assert.assertEquals(mp.getDeleteCustomerHref(),"https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
        Assert.assertTrue(mp.getDeleteCustomerLink().isDisplayed());
        Assert.assertTrue(mp.getDeleteCustomerLink().isEnabled());

    }
    @Test (dependsOnMethods = {"newCustomerLinkIsVisibleTest", "editCustomerLinkVisibleTest"})
    public void newAccountLinkTest() {
        ManagerHomePage mp = new ManagerHomePage(driver);
        log.info("test 4");
        mp.navigateToMangerPage(mp.managerPageURL);
        Assert.assertEquals(mp.getNewAccountHref(),"https://demo.guru99.com/V1/html/addAccount.php");
        Assert.assertTrue(mp.getNewAccountLink().isDisplayed());
        Assert.assertTrue(mp.getNewAccountLink().isEnabled());
    }
}
