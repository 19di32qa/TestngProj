package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.ManagerHomePage;
import org.testng.annotations.Test;

public class TC_0002_ManagerHomePage extends BaseClass {

    @Test
    public void managerHomePageSliderTest() {
        ManagerHomePage mp = new ManagerHomePage(driver);
        mp.navigateToMangerPage(mangerHomePage);
        mp.checkText("Welcome To Manager's Page of GTPL Bank");
        mp.closeDriver();
    }
}
