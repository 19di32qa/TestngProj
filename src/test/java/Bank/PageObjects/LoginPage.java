package Bank.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By userName = By.name("uid");
    By password = By.name("password");
    By submitBTN = By.name("btnLogin");

    public void setUserName(String string) {
        driver.findElement(userName).sendKeys(string);
    }
    public void setPassword(String string) {
        driver.findElement(password).sendKeys(string);
    }
    public void submitClick() {
        driver.findElement(submitBTN).click();
    }
    public void homePage(String string) {
        driver.get(string);
    }


}
