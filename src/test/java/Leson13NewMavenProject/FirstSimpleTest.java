package Leson13NewMavenProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSimpleTest {
    private static WebDriver driver;


    @BeforeAll
    public static void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void goToTheMainPage() {
        driver.get("https://open.spotify.com/");
        Assertions.assertTrue(driver.getCurrentUrl().contains("spotify.com"));
    }

    @AfterEach
    public void closeTheBrowser() {
        driver.close();
    }

}
