package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDuffleBagPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class GearTestSteps {
    @Given("^I hover on the Gear menu and click bags option$")
    public void iHoverOnTheGearMenuAndClickBagsOption() {
        new HomePage().mouseHoverOnGearMenuAndClicksOnBagsOption();
    }

    @And("^I click the product named 'Overnight Duffle'$")
    public void iClickTheProductNamedOvernightDuffle() {
        new BagsPage().clickODuffleBagOption();
    }

    @And("^I should see the text of bag \"([^\"]*)\"$")
    public void iShouldSeeTheTextOfBag(String duffle) {
        new OverNightDuffleBagPage().verifyOvernightDuffleText();
    }

    @And("^I change the quantity to (\\d+)$")
    public void iChangeTheQuantityTo(int arg0) {
        new OverNightDuffleBagPage().quantitySpaceOption();
    }

    @And("^I click on the 'Add to Cart' button duffle bag$")
    public void iClickOnTheAddToCartButtonDuffleBag() {
        new OverNightDuffleBagPage();
    }

    @And("^I should see the text \"([^\"]*)\"$")
    public void iShouldSeeTheText(String added) {
        new OverNightDuffleBagPage().verifyYouAddedOvernightDuffleToYourShoppingCartText();
    }

    @And("^I click on the 'shopping cart' link in the message$")
    public void iClickOnTheShoppingCartLinkInTheMessage() {
        new OverNightDuffleBagPage().clickOnShoppingCartLinkOption();
    }

    @And("^I should see the product name \"([^\"]*)\"$")
    public void iShouldSeeTheProductName() {
        new OverNightDuffleBagPage().verifyOvernightDuffleText();
    }

    @And("^The quantity should be \"([^\"]*)\"$")
    public void theQuantityShouldBe(String qty) {
        new OverNightDuffleBagPage().quantitySpaceOption();
    }

    @And("^The product price should be \"([^\"]*)\"$")
    public void theProductPriceShouldBe(String txt) {
        new OverNightDuffleBagPage().verifyProductPrice();
    }

    @And("^I update the quantity to \"([^\"]*)\"$")
    public void iUpdateTheQuantityTo(String qty) {
        new OverNightDuffleBagPage().quantitySpaceOption();
    }

    @And("^I click on the Update Shopping Cart button$")
    public void iClickOnTheUpdateShoppingCartButton() {
    }

    @And("^the product price should be \"([^\"]*)\"$")
    public void theProductPriceShouldBe() {
        new ShoppingCartPage().verifyUpdatedPriceText();

    }
}


