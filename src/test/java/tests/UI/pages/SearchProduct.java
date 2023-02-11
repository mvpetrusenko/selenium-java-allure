package tests.UI.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import tests.UI.base.BaseUITest;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class SearchProduct extends BaseUITest {

    @Test
    public void testSearchProduct() {

        //driver.findElement(By.xpath(xpath));

        //$(byXpath("//button[contains(@id,'onetrust-accept-btn-handler')]")).click();

        //public static final String acceptCookies = "//button[contains(@id,'onetrust-accept-btn-handler')]";



        //public static final String ACCEPT_ALL_COOKIES = "//button[contains(@id,'onetrust-accept-btn-handler')]";


        //$("#onetrust-accept-btn-handler").click();

//        private final SelenideElement acceptCookies = $(byText("Accept Cookies"));
//        acceptCookies.click();

        //$(byText("Accept Cookies")).shouldBe(Condition.visible).click();
        //$(byText("Accept Cookies")).click();

//        @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
//        WebElement acceptCookies;


    }
}


