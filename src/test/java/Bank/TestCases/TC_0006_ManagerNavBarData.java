package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.DataProviderForNavBar;
import Bank.PageObjects.ManagerPageNavBar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_0006_ManagerNavBarData extends BaseClass {

    @Test(dataProvider = "data_of_navbar", dataProviderClass = DataProviderForNavBar.class)
    public void navBarTest(String string) {
        ManagerPageNavBar mp = new ManagerPageNavBar(driver);
        driver.get(mp.basePage);
        Assert.assertTrue(mp.getListElement(string).isDisplayed());
    }
}
