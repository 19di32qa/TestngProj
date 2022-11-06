package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.EditCustomerPage;
import Bank.PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_0010_EditCustomer extends BaseClass {
    @Test
    public void editCustomerTest() {
        LoginPage lp = new LoginPage(driver);
        log.info("test");
        lp.homePage(baseURL);
        lp.setUserName(userName);
        lp.setPassword(password);
        lp.submitClick();
        EditCustomerPage ep = new EditCustomerPage(driver);
        driver.get(ep.url);
        ep.getCustomerId().sendKeys(ep.customerId);
        ep.getSubmitBTN().click();

        Assert.assertFalse(ep.getElement(ep.name).isEnabled());
        Assert.assertFalse(ep.getElement(ep.gender).isEnabled());
        Assert.assertFalse(ep.getElement(ep.dob).isEnabled());

        Assert.assertTrue(ep.getElement(ep.addr).isEnabled());
        Assert.assertTrue(ep.getElement(ep.pinno).isEnabled());
        Assert.assertTrue(ep.getElement(ep.emailid).isEnabled());
        Assert.assertTrue(ep.getElement(ep.city).isEnabled());
        Assert.assertTrue(ep.getElement(ep.telephoneno).isEnabled());

        String str =ep.getElement(ep.city).getAttribute("value");

        WebElement element = ep.getElement(ep.city); // you can use any locator
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='Washington';", element);
        ep.getElement(ep.sub).click();
        driver.switchTo().alert().accept();

        ep.getCustomerId().sendKeys(ep.customerId);
        ep.getSubmitBTN().click();

        Assert.assertEquals(ep.getElement(ep.city).getAttribute("value"),"Washington");

    }
}
