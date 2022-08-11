import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utills.PropertyReader;

public class BaseTest {
    protected WebDriver driver;



    @BeforeEach
    public void setUpDriver() {
        String browser = PropertyReader.BROWSER.toLowerCase();
        switch (browser) {
            case ("chrome"): {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case ("firefox"): {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            default:
                throw new InvalidArgumentException("No such driver is available");
        }
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }


}
