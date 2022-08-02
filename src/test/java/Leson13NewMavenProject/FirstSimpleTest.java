package Leson13NewMavenProject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSimpleTest {

    @Test
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/poshivailov1/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("google.com");
    }
}
