import org.junit.jupiter.api.*;
import pages.MainPage;


public class FirstSimpleTest extends BaseTest {

    MainPage mainPage;


    @Test
    public void goToTheMainPage() {
        driver.get("http://automationpractice.com/");
        Assertions.assertTrue(driver.getCurrentUrl().contains("automationpractice"));
        mainPage = new MainPage(driver);
        mainPage.checkIfLoginButtonISVisible();
    }

}

