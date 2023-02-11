package tests.UI.pages;

import org.testng.annotations.Test;
import tests.UI.base.BaseUITest;
import tests.restAPI.RestAssuredAPITest;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class SearchProduct extends BaseUITest {

    @Test
    public static void main(String[] args) {
        BaseUITest.main(args);
        $(byXpath("//a[@href='/search']")).click();
    }
}




