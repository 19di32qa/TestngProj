package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.LoginPage;
import Bank.PageObjects.NewAccountPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TC_0011_AddAccount extends BaseClass {

    @Test
    public void addAccountTest() {
        String cusId = "95413";
        LoginPage lp = new LoginPage(driver);
        //log.info("test");
        lp.homePage(baseURL);
        lp.setUserName(userName);
        lp.setPassword(password);
        lp.submitClick();

        NewAccountPage ap = new NewAccountPage(driver);
        ap.getPage();
        ap.setCusId(cusId);
        ap.setSavings();
        ap.setInitDeposit("1234");
        ap.submitBTN();
        String accountId = ap.getAccountId();
        createTextFileWithAccountId(accountId);
        Assert.assertEquals(ap.getSuccessText().getText(),"Account Generated Successfully!!!");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]")).getText(),"1234");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]")).getText(),"95413");
        
        driver.quit();
    }

    public void createTextFileWithAccountId(String id) {
        try {
            FileWriter file = new FileWriter("C:\\Users\\Dima\\Desktop\\TestngProject\\src\\main\\Customers\\ac"+id+".txt");
            file.write("Account: "+id);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
