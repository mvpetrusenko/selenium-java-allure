package tests.UI.pages;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import tests.UI.base.BaseUITest;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class SearchProduct extends BaseUITest {

//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//
//        //WebDriver driver = new ChromeDriver(); // launch chrome
//
//        driver.manage().window().maximize(); // maximize window
//        driver.manage().deleteAllCookies(); // delete all the cookies
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    // dynamic wait
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //public static String baseUrl = "https://open.spotify.com/";

    //driver.get();


    //driver.get("https://open.spotify.com/");


    @Test
    public void testSearchProduct() {
//        WebDriver driver = new ChromeDriver();
////                WebElement acceptCookies = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
////
//        WebElement acceptCookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
//        acceptCookies.click();



       // $(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

        //By acceptButton = By.xpath("//button[@id='onetrust-accept-btn-handler']");

//        String acceptButton = "//button[@id='onetrust-accept-btn-handler']";
//        $(byXpath(acceptButton)).click();


        //$(byXpath("//button[@id='onetrust-accept-btn-handler']")).click();
        //$(acceptButton).click();











//        WebElement search = driver.findElement(By.xpath("//a[contains(@href,'/search')]"));
//        search.click();
//
//        String expected = "https://open.spotify.com/search";
//
//        String actualURL = "https://open.spotify.com/search";
//
//        Assert.assertEquals(expected, actualURL);
//
//        WebElement searchInput = driver.findElement(By.xpath(" //input[@data-testid=\"search-input\"] "));
//        searchInput.sendKeys("Justin Bieber");
//        searchInput.getText();






        //Assert.assertTrue(searchInput.contains("Justin Bieber"));
        //Assert.assertTrue(driver.getPageSource().contains("Justin Bieber");
        //assertEquals(searchInput.getText(), "Justin Bieber");
        //


    }
}

