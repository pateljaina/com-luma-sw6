package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantsPage extends Utility {
    private static final Logger log = LogManager.getLogger(PantsPage.class.getName());
    public PantsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsOption;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverOnProductNameOption;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'])[1]")
    WebElement mouseHoverAndClickOnProductNameOption;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'])[1]")
    WebElement mouseHoverAndClickOnColourNameOption;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement mouseHoverAndClickOnAddToCartOption;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToYourShoppingCartMethodText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartOption;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartTextMethod;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement pantTextMethod;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement sizeTextMethod;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourTextMethod;


    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(String pant) {
        log.info("Click Cronus yoga pants size option" + mouseHoverOnProductNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);

    }

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(String pant) {
        log.info("Click on cronus pants colour option" + mouseHoverAndClickOnColourNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnColourNameOption);
    }

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption() {
        log.info("Mouse hover on Product name and add to cart" + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }


    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        log.info("youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText " + addedToYourShoppingCartMethodText.toString());
        return getTextFromElement(addedToYourShoppingCartMethodText);
    }
    public void clickOnShoppingCartOption() {
        log.info("Click on Shopping cart option" + pantsOption.toString());
        clickOnElement(pantsOption);

    }

    public String shoppingCartText() {
        log.info("Get text from" + shoppingCartTextMethod.toString());
        String message =  getTextFromElement(shoppingCartTextMethod);
        return message;
    }

    public String cronusPantText() {
        log.info("Get text from" + pantTextMethod.toString());
        String message = getTextFromElement(pantTextMethod);
        return message;
    }

    public String verifySizeText() {
        log.info("Get text from" + sizeTextMethod.toString());
        String message = getTextFromElement(sizeTextMethod);
        return message;
    }

    public String verifyColourOfPantText() {
        log.info("Get text from" + colourTextMethod.toString());
        String message =  getTextFromElement(colourTextMethod);
        return message;
    }
}
