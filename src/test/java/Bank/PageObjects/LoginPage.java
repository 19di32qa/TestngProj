package Bank.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By userName = By.name("uid");
    By password = By.name("password");
    By submitBTN = By.name("btnLogin");
    By resetBTN = By.cssSelector("[type=\"reset\"]");

    public void setUserName(String string) {
        driver.findElement(userName).sendKeys(string);
    }
    public void setPassword(String string) {
        driver.findElement(password).sendKeys(string);
    }
    public void submitClick() {
        driver.findElement(submitBTN).click();
    }
    public void resetBTNClick(){driver.findElement(resetBTN).click();}
    public void homePage(String string) {
        driver.get(string);
    }

    public WebElement getUserNameField() {
        return driver.findElement(userName);
    }
    public WebElement getPasswordField() {
        return driver.findElement(password);
    }


}
