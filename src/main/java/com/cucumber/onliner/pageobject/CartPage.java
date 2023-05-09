package com.cucumber.onliner.pageobject;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;


public class CartPage extends BasePage {

    private final SelenideElement productInCart =
            $x("//div[contains(@class, 'offers-item_secondary')]");
    private final SelenideElement buttonCart =
            $x("//a[contains(text(), 'Перейти в корзину')]");

    public void openCartOnlinerWebsite() {
        buttonCart
                .shouldBe(exist, ofSeconds(30))
                .shouldBe(visible, ofSeconds(10))
                .shouldBe(enabled, ofSeconds(10))
                .click();
    }

    public SelenideElement isCartWithProductDisplayed() {
        return productInCart.shouldBe(visible, ofSeconds(30));
    }
}
