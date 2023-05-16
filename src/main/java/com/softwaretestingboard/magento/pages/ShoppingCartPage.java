package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement nightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceText;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement qtyText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qtyOption;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shopCartOption;

    @CacheLookup
    @FindBy(xpath = "/span[@class='cart-price']//span)[2]")
    WebElement priceTextMethod;
    public String verifyOvernightDuffleTextMethod() {
       log.info("Verify overnight duffle text" + nightDuffleText.toString());
        String message = getTextFromElement(nightDuffleText);
        return message;
    }

    public String verifyQuantityText() {
       log.info("Verify quantity" + qtyText.toString());
        String message = getTextFromElement(qtyText);
        return message;
    }

    public String verifyProductPrice() {
       log.info("Verify product price" + priceText.toString());
        String message = getTextFromElement(priceText);
        return message;
    }

    public void quantityUpdateText() {
       log.info("Update quantity" + qtyOption.toString());
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(qtyOption, "5"); // Type in the new text

    }

    public void clickOnShoppingCartButtonOption() {
       log.info("Click on shopping cart button" + shopCartOption.toString());
        clickOnElement(shopCartOption);

    }

    public String verifyUpdatedPriceText() {
       log.info("Get text from" + priceTextMethod.toString());
        String message = getTextFromElement(priceTextMethod);
        return message;
    }

}
