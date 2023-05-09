package com.cucumber.onliner.pageobject;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class Header extends BasePage {

    private static final String ONLINER_URL = "https://www.onliner.by/";

    public void openOnlinerWebsite() {
        open(ONLINER_URL);
    }

    private static final String MAIN_NAVIGATION_LINK_XPATH_PATTER =
            "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";

    public CatalogPage clickOnMainNavigationLink(String link) {
        $x(format(MAIN_NAVIGATION_LINK_XPATH_PATTER, link))
                .shouldBe(visible, ofSeconds(30))
                .click();
        return new CatalogPage();
    }
}
