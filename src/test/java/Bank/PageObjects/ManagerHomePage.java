package Bank.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ManagerHomePage {
    WebDriver driver;
    public String managerPageURL = "https://demo.guru99.com/V1/html/Managerhomepage.php";

    By slideText = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");
    By addCustomerLink = By.cssSelector("[href =\"addcustomerpage.php\"]");
    By editCustomerLink = By.cssSelector("[href=\"EditCustomer.php\"]");
    By deleteCustomerLink = By.cssSelector("[href =\"DeleteCustomerInput.php\"]");
    By newAccountLink = By.cssSelector("[href=\"addAccount.php\"]");
    By editAccountLink = By.cssSelector("[href =\"editAccount.php\"]");
    By deleteAccountLink = By.cssSelector("[href=\"deleteAccountInput.php\"]");
    By miniStatementLink = By.cssSelector("[href=\"MiniStatementInput.php\"]");
    By customisedStatementLink = By.cssSelector("[href =\"CustomisedStatementInput.php\"]");
    By logOutLink = By.cssSelector("[href=\"Logout.php\"]");

    public ManagerHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void closeDriver() {driver.quit();}

    public void switchToAlert() {
        this.driver.switchTo().alert().accept();
    }

    public void navigateToMangerPage(String string) {
        driver.get(string);
    }
    public void checkText(String string) {Assert.assertEquals(driver.findElement(slideText).getText(), string);}

    public WebElement getAddCustomerLink() {return driver.findElement(addCustomerLink);}
    public WebElement getEditCustomerLink() {return driver.findElement(editCustomerLink);}
    public WebElement getDeleteCustomerLink() {return driver.findElement(deleteCustomerLink);}
    public WebElement getNewAccountLink() {return driver.findElement(newAccountLink);}
    public WebElement getLogOutLink() {return driver.findElement(logOutLink);}

    public String getAddCustomerHref() {return driver.findElement(addCustomerLink).getAttribute("href");}
    public String getEditCustomerHref() {return driver.findElement(editCustomerLink).getAttribute("href");}
    public String getDeleteCustomerHref() {return driver.findElement(deleteCustomerLink).getAttribute("href");}
    public String getNewAccountHref() {return driver.findElement(newAccountLink).getAttribute("href");}
    public String getEditAccountHref() {return driver.findElement(editAccountLink).getAttribute("href");}
    public String getDeleteAccountHref() {return driver.findElement(deleteAccountLink).getAttribute("href");}
    public String getMiniStatementHref() {return driver.findElement(miniStatementLink).getAttribute("href");}
    public String getCustomisedStatementHref() {return driver.findElement(customisedStatementLink).getAttribute("href");}
    public String getLogOutHref() {return driver.findElement(logOutLink).getAttribute("href");}
}
