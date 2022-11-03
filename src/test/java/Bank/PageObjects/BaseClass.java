package Bank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public static WebDriver driver;
    public String baseURL = "https://demo.guru99.com/V1/index.php";
    public String userName = "mngr451715";
    public String password = "dyrYnUj";


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dima\\Desktop\\TestngProject\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
