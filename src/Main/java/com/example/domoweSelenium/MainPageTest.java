package com.example.domoweSelenium;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {
    @Test
    public void userCanSearch() {

        open("https://demo.opencart.com/");
        new MainPage().searchFor("iPod");

        SearchResultPage results = new SearchResultPage();
        results.getResult(0).shouldHave(text("iPod"));
    }
}