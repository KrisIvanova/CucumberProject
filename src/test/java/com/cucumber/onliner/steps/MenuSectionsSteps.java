package com.cucumber.onliner.steps;

import com.cucumber.onliner.pageobject.CartPage;
import com.cucumber.onliner.pageobject.CatalogPage;
import com.cucumber.onliner.pageobject.Header;
import com.cucumber.onliner.pageobject.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;

public class MenuSectionsSteps {

    private final Header header = new Header();
    public CatalogPage catalogPage = new CatalogPage();
    public ProductPage productPage = new ProductPage();
    public CartPage cartPage = new CartPage();

    @Given("the user opens Onliner website")
    public void userOpensOnlinerWebsite() {
        header.openOnlinerWebsite();
    }

    @When("the user clicks on the {string} section")
    public void theUserClicksOnTheSection(String section) {
        header.clickOnMainNavigationLink(section);
    }

    @When("the user clicks on the {string} classification")
    public void userClickOnTheClassification(String classification) {
        catalogPage.clickOnCatalogClassifierLink(classification);
    }

    @When("the user clicks on the {string} category")
    public void userClickOnTheCategory(String category) {
        catalogPage.clickOnCatalogClassifierCategoryLink(category);
    }

    @When("the user clicks on the {string} product")
    public void userClickOnTheProduct(String product) {
        catalogPage.clickOnProductLink(product);
    }

    @When("the user clicks on the product item")
    public void userClickOnTheProductItem() {
        productPage.clickOnProductItemLink();
    }

    @When("the user adds item to cart")
    public void userAddsItemToCart() {
        productPage.addItemToCart();
    }

    @When("the user confirms the city")
    public void UserConfirmsTheCity() {
        productPage.confirmsTheCity();
    }

    @Then("cart with product is displayed")
    public void cartWithProductIsDisplayed() {
        cartPage.openCartOnlinerWebsite();
        cartPage.isCartWithProductDisplayed()
                .shouldBe(exist, visible);
    }
}

