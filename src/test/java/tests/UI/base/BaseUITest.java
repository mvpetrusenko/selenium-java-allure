package tests.UI.base;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import tests.UI.pages.SearchProduct;
import tests.restAPI.RestAssuredAPITest;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class BaseUITest {


    @BeforeMethod(alwaysRun = true)
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        WebDriverRunner.setWebDriver(driver);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        open("https://open.spotify.com/");
        $(byXpath(Variables.acceptCookies)).click();
        //$(byXpath("//button[contains(@id,'onetrust-accept-btn-handler')]")).click();
        //$(".welcome-message").shouldHave(text("Welcome, user!"))


    }
}

