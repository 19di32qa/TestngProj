package Bank.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ManagerHomePage {
    WebDriver driver;
    By slideText = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");

    public ManagerHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateToMangerPage(String string) {
        driver.get(string);
    }
    public void checkText(String string) {
        Assert.assertEquals(driver.findElement(slideText).getText(), string);
    }
}
