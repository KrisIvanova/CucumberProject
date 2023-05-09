package com.cucumber.onliner.pageobject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class ProductPage extends BasePage {

    private final ElementsCollection basketsCollection =
            $$x("//a[contains(@class, 'button-style_expletive')]");
    private final String  basketsCollectionItem =
            "//a[contains(@class, 'button-style_expletive')]";

    private final SelenideElement confirmsTheCity =
            $x("//span[contains(text(), 'Да, верно')]");

    private final ElementsCollection productTitleCollection =
            $$x("//span[contains(@data-bind, 'product.full_name')]");

    private final String productTitleCollectionItem =
            "//span[contains(@data-bind, 'product.full_name')]";


    public ProductPage clickOnProductItemLink() {
        String link = productTitleCollection.texts().get(0);
        $x(format(productTitleCollectionItem, link))
                .shouldBe(exist, ofSeconds(30))
                .shouldBe(visible, ofSeconds(10))
                .shouldBe(enabled, ofSeconds(10))
                .click();
        return new ProductPage();
    }

    public void addItemToCart() {
        String link = basketsCollection.texts().get(0);
        $x(format(basketsCollectionItem, link))
                .shouldBe(exist, ofSeconds(30))
                .shouldBe(visible, ofSeconds(10))
                .shouldBe(enabled, ofSeconds(10))
                .click();
    }
    public void confirmsTheCity() {
        confirmsTheCity
                .shouldBe(visible, ofSeconds(10))
                .shouldBe(enabled, ofSeconds(10))
                .click();
    }

}
