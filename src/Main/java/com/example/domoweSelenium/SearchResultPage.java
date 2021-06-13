package com.example.domoweSelenium;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    public SelenideElement getResult(int index) {
        return $("#content > h1", index);
    }
}

