package Bank.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public Logger log = LoggerFactory.getLogger(BaseClass.class);
    public static WebDriver driver;
    public String baseURL = "https://demo.guru99.com/V1/index.php";
    public String userName = "mngr451715";
    public String password = "dyrYnUj";
    public String mangerHomePage = "https://demo.guru99.com/V1/html/Managerhomepage.php";


    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dima\\Desktop\\TestngProject\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        log.info("webdriver is set");

    }
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
