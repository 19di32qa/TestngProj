package Bank.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewCustomer {
    WebDriver driver;
    public String homeUrl = "https://demo.guru99.com/v3/manager/addcustomerpage.php";
    public AddNewCustomer(WebDriver driver) {
        this.driver = driver;
    }
    private By customerName = By.name("name");
    private By maleGenderButton = By.cssSelector("input[value=\"m\"]");
    private By femaleGenderButton = By.cssSelector("input[value=\"f\"]");
    private By addr = By.name("addr");
    private By date = By.cssSelector("#dob");
    private By city = By.name("city");
    private By state = By.name("state");
    private By pinno = By.name("pinno");
    private By telephoneno = By.name("telephoneno");
    private By emailid = By.name("emailid");
    private By password = By.name("password");
    private By sub = By.name("sub");
    private By res = By.name("res");

    public WebElement getCustomerName() {
        return driver.findElement(customerName);
    }
    public WebElement getMaleGenderButton() {
        return driver.findElement(maleGenderButton);
    }
    public WebElement getFemaleGenderButton() {
        return driver.findElement(femaleGenderButton);
    }
    public WebElement getAddr() {
        return driver.findElement(addr);
    }
    public WebElement getDateField() {
        return driver.findElement(date);
    }
    public WebElement getCity() {
        return driver.findElement(city);
    }
    public WebElement getState() {
        return driver.findElement(state);
    }
    public WebElement getPIN() {
        return driver.findElement(pinno);
    }
    public WebElement getMobile() {
        return driver.findElement(telephoneno);
    }
    public WebElement getEmail() {
        return driver.findElement(emailid);
    }
    public WebElement getPassword() {
        return driver.findElement(password);
    }
    public WebElement getSubmit() {
        return driver.findElement(sub);
    }
    public WebElement getReset() {
        return driver.findElement(res);
    }
    public void closeDriver() {
        driver.quit();
    }
}
