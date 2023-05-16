package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomensTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @And("^I click on Womens Menu Tab$")
    public void iClickOnWomensMenuTab() {
        new HomePage().mouseHoverOnWomenMenuTab();
    }

    @And("^I click on Tops submenu option$")
    public void iClickOnTopsSubmenuOption() {
        new HomePage().mouseHoverOnWomenTopMenuOption();
    }

    @And("^I click on Jackets option$")
    public void iClickOnJacketsOption() {
        new HomePage().clickJacketsOption();
    }

    @When("^I select the filter to sort by \"([^\"]*)\"$")
    public void iSelectTheFilterToSortBy(String jacket){
        new JacketsPage().productSortByProductName(jacket);
    }

    @Then("^I should see the products name display in alphabetical order$")
    public void iShouldSeeTheProductsNameDisplayInAlphabeticalOrder() {
        new JacketsPage().sortInAlphabeticalOrder();
    }

    @Then("^I should see the products price display in ascending order$")
    public void iShouldSeeTheProductsPriceDisplayInAscendingOrder() {
    }
}
