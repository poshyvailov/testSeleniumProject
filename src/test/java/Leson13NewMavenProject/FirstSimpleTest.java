package Leson13NewMavenProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
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
        driver.get("http://automationpractice.com");
        Assertions.assertTrue(driver.getCurrentUrl().contains("automationpractice"));
        driver.findElement(By.xpath("//a[@class='login']")).isDisplayed();
    }

    @AfterEach
    public void closeTheBrowser() {
        driver.close();
    }

}
