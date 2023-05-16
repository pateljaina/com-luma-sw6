package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MensTestSteps {
    @When("^I click on Mens Menu tab$")
    public void iClickOnMensMenuTab() {
        new HomePage().mouseHoverOnMenMenuTab();
    }

    @And("^I click on Bottoms submenu option$")
    public void iClickOnBottomsSubmenuOption() {
        new HomePage().mouseHoverOnMenBottomsMenuOption();
    }

    @And("^I click on Pants option$")
    public void iClickOnPantsOption() {
        new HomePage().setPantsOption();
    }

    @And("^I hover on the 'Cronus Yoga Pant' and click on size \"([^\"]*)\"\\.$")
    public void iHoverOnTheCronusYogaPantAndClickOnSize(String size) {
        new PantsPage().mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(size);
    }

    @And("^I hover on the 'Cronus Yoga Pant' and click on the colour \"([^\"]*)\"\\.$")
    public void iHoverOnTheCronusYogaPantAndClickOnTheColour(String colour) {
        new PantsPage().mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(colour);
    }

    @And("^I hover on the 'Cronus Yoga Pant' and click on the ‘Add To Cart’ Button\\.$")
    public void iHoverOnTheCronusYogaPantAndClickOnTheAddToCartButton() {
        new PantsPage().mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption();
    }

    @And("^I should see the text \"([^\"]*)\"$")
    public void iShouldSeeTheText(String added) {
        new PantsPage().youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText();
    }

    @And("^I should see the title \"([^\"]*)\"$")
    public void iShouldSeeTheTitle(String title) {
        new PantsPage().youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText();
    }

    @And("^I should click on Shopping Cart Link from message$")
    public void iShouldClickOnShoppingCartLinkFromMessage() {
        new PantsPage().clickOnShoppingCartOption();
    }

    @And("^I should see the product Title \"([^\"]*)\"$")
    public void iShouldSeeTheProductTitle(String arg0) {
        new PantsPage().cronusPantText();
    }

    @And("^I should see the size as \"([^\"]*)\"$")
    public void iShouldSeeTheSizeAs(String size) {
        new PantsPage().verifySizeText();
    }

    @Then("^I should see the colour as \"([^\"]*)\"$")
    public void iShouldSeeTheColourAs(String colour) {
        new PantsPage().verifyColourOfPantText();
    }


}
