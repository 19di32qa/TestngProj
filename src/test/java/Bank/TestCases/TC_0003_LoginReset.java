package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_0003_LoginReset extends BaseClass {

    @Test
    public void resetButtonTest() {
        LoginPage lp = new LoginPage(driver);
        lp.homePage(baseURL);
        lp.setUserName("text1");
        lp.setPassword("text2");
        lp.resetBTNClick();
        Assert.assertEquals(lp.getUserNameField().getAttribute("value"),"");
        Assert.assertEquals(lp.getPasswordField().getAttribute("value"),"");
    }



}
