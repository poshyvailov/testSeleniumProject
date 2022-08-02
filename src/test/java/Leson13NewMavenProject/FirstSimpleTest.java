package Leson13NewMavenProject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSimpleTest {

    @Test
    public void initDriver(){
        WebDriver driver = new ChromeDriver();
        driver.get("google.com");
    }
}
