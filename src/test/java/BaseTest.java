import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public ChromeDriver driver;
    /* Needs a way to store settings, e.g. Configuration Manager */
    private String browserUrl = "https://www.faceit.com/";
    private String pathToChromeDriver = "C:\\Users\\Dima\\Desktop\\o\\chromedriver_win32\\chromedriver.exe";
    private String chromeProperty = "webdriver.chrome.driver";

    @BeforeClass
    public void BeforeClass(){
        System.setProperty(chromeProperty, pathToChromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(browserUrl);
    }

    /* All tests are in one class, so teardown needs only after class for now */

    @AfterClass
    public void AfterClass(){
        driver.quit();
    }
}