package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_0005_LoginTextCheck extends BaseClass {
    @Test(groups = {"Login/logout"})
    public void checkTextTest() {
        LoginPage lp = new LoginPage(driver);
        lp.homePage(baseURL);
        Assert.assertEquals(lp.getHeaderText(),"Gtpl Bank");
        Assert.assertEquals(lp.getTitle(), lp.title);
        lp.closeDriver();
    }
}
