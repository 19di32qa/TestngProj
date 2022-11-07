package Bank.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
    WebDriver driver;
    String url = "https://demo.guru99.com/v3/manager/addAccount.php";
    public  NewAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    By cusid = By.name("cusid");
    By selaccount = By.name("selaccount");
    By inideposit = By.name("inideposit");
    By subBtn = By.name("button2");
    By successText = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p");

    public void submitBTN() {
        driver.findElement(subBtn).click();
    }
    public  void getPage() {
        driver.get(url);
    }
    public void setSavings() {
        Select el = new Select(driver.findElement(selaccount));
        el.selectByValue("Savings");
    }
    public void setCurrent() {
        Select el = new Select(driver.findElement(selaccount));
        el.selectByValue("Current");
    }
    public void setInitDeposit(String str) {
        driver.findElement(inideposit).sendKeys(str);
    }
    public void setCusId(String str) {
        driver.findElement(cusid).sendKeys(str);
    }
    public String getAccountId() {
        return driver.getCurrentUrl().substring(driver.getCurrentUrl().length()-6);
    }
    public WebElement getSuccessText() {
        return driver.findElement(successText);
    }

}
