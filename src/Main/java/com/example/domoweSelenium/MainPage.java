package com.example.domoweSelenium;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public void searchFor(String text) {
        $(By.name("search")).val(text).pressEnter();
    }
}