package Bank.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteCustomerPage {
    WebDriver driver;
    public String baseUrl = "https://demo.guru99.com/v3/manager/DeleteCustomerInput.php";

    public DeleteCustomerPage(WebDriver driver) {
        this.driver = driver;
    }
    By customerId = By.name("cusid");
    By submitBTN = By.name("AccSubmit");
    By resetBTN = By.name("res");

    public WebElement getCustomerId() {
        return driver.findElement(customerId);
    }
    public WebElement getSubmitBTN() {
        return driver.findElement(submitBTN);
    }
    public WebElement getResetBTN() {
        return  driver.findElement(resetBTN);
    }
    public void closeDriver() {
        driver.quit();
    }
}
