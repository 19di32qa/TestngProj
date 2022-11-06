package Bank.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditCustomerPage {
    WebDriver driver;
    public String url = "https://demo.guru99.com/v3/manager/EditCustomer.php";
    public String customerId = "95413";
    public EditCustomerPage(WebDriver driver) {
        this.driver = driver;
    }
    By cusId = By.name("cusid");
    By submitBTN = By.name("AccSubmit");

    public By name = By.name("name");
    public By gender = By.name("gender");
    public By dob = By.name("dob");

    public By city = By.name("city");
    public By addr = By.name("addr");
    public By pinno = By.name("pinno");
    public By telephoneno = By.name("telephoneno");
    public By emailid = By.name("emailid");
    public By sub = By.name("sub");

    public WebElement getCustomerId() {
        return driver.findElement(cusId);
    }
    public WebElement getSubmitBTN() {
        return driver.findElement(submitBTN);
    }
    public WebElement getElement(By selector) {
        return driver.findElement(selector);
    }
}
