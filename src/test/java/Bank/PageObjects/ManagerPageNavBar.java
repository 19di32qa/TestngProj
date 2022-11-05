package Bank.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManagerPageNavBar {

    WebDriver driver;
    public  ManagerPageNavBar(WebDriver driver) {
        this.driver = driver;
    }

    public String basePage = "https://demo.guru99.com/V1/html/Managerhomepage.php";
    public String baseUrl = "https://demo.guru99.com/V1/html/";
    public void closeDriver() {driver.quit();}

    public WebElement getListElement(String string) {
        return driver.findElement(By.cssSelector(string));
    }
    public String getListElementHref(String string) {
        return  driver.findElement(By.cssSelector(string)).getAttribute("href");
    }
}
