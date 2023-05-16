package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement WomenMenuOption;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement mouseHoverOnTopMenuOption;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jacketsOption;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenuOption;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottomsMenuOption;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsOption;

    // @CacheLookup
    //@FindBy(xpath = "//span[normalize-space()='Gear']")
    // WebElement mouseHoverOnGearOption;

    @CacheLookup
    @FindBy(xpath = "(//span[normalize-space()='Gear']")
    WebElement mouseHoverGearAndClickOption;


    public void mouseHoverOnWomenMenuTab() {
        log.info("Mouse Hover over womens menu" + WomenMenuOption.toString());
        mouseHoverToElement(WomenMenuOption);

    }

    public void mouseHoverOnWomenTopMenuOption() {
        log.info("Mouse Hover over womens top menu" + mouseHoverOnTopMenuOption.toString());
        mouseHoverToElement(mouseHoverOnTopMenuOption);

    }

    public void clickJacketsOption() {
        log.info("Set Jackets Options" + jacketsOption.toString());
        clickOnElement(jacketsOption);
    }

    public void mouseHoverOnGearMenuAndClicksOnBagsOption() {
        log.info("Mouse hover and click Gear Menu" + mouseHoverGearAndClickOption.toString());
        mouseHoverToElementAndClick(mouseHoverGearAndClickOption);
    }
    public void mouseHoverOnMenMenuTab() {
        log.info("Mouse hover on mens Menu Tab" + menMenuOption.toString());
        mouseHoverToElement(menMenuOption);

    }

    public void mouseHoverOnMenBottomsMenuOption() {
        log.info("Mouse hover on mens bottom menu" + mouseHoverOnBottomsMenuOption.toString());
        mouseHoverToElement(mouseHoverOnBottomsMenuOption);
    }

    public void setPantsOption() {
        log.info("Set pants options" + pantsOption.toString());
        clickOnElement(pantsOption);
    }
}
