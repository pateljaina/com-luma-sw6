package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverNightDuffleBagPage extends Utility {
    private static final Logger log = LogManager.getLogger(OverNightDuffleBagPage.class.getName());
    public OverNightDuffleBagPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityOption;

    @CacheLookup
    @FindBy(xpath = "//button[@title='Search']")
    WebElement mouseHoverAndClickOnAddToCartOption;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAddedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartOption;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceText;


    public String verifyOvernightDuffleText() {
        log.info("Verify overnight duffle text" + overNightDuffleText.toString());
        String message = getTextFromElement(overNightDuffleText);
        return message;
    }

    public void quantitySpaceOption() {
        log.info("Enter quantity 3" + quantityOption.toString());
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "3"); // Type in the new text

    }
    public void clickOnAddToCartButtonDuffleBag() {
        log.info("mouseHoverOnAddToCartOption " + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }

    public String verifyYouAddedOvernightDuffleToYourShoppingCartText() {
        log.info("Verify overnight duffle text" + youAddedText.toString());
        String message = getTextFromElement(youAddedText);
        return message;
    }

    public void clickOnShoppingCartLinkOption() {
        log.info("Click on Shopping cart link option" + cartOption.toString());
        clickOnElement(cartOption);

    }
    public String verifyProductPrice() {
        log.info("verifyProductPrice " + priceText.toString());
        return getTextFromElement(priceText);
    }

}
