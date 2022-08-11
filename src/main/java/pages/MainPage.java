package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final WebElement buttonLogin = driver.findElement(By.xpath("//a[@class='login']"));

    public MainPage checkIfLoginButtonISVisible(){
        buttonLogin.isDisplayed();
        return this;
    }



}
