package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement mouseHoverBuySell;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement clickSearchCar;
    @CacheLookup
    @FindBy(xpath = "//div[contains(@class,'heading main-heading item-ad-wrapper')]//h1")
    WebElement newAndUsedCarSearch;
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement selectmakeAnyTab;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement selectAnyModel;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement selectAnyLocation;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement selectLowPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement searchMyCar;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement myMake;

    public void mouseHoverOnBuyAndSellTab() {
        log.info("Mouse hover to buy and sell " + mouseHoverBuySell.getText());
        mouseHoverToElement(mouseHoverBuySell);
    }
    public void clickOnSearchCar() {
        log.info("click on the Search Car Menu" + clickSearchCar.getText());
        clickOnElement(clickSearchCar);
    }
    public String verifyNewAndUsedCar() {
        log.info("Getting text from element " + newAndUsedCarSearch.toString());
        return getTextFromElement(newAndUsedCarSearch);
    }
    public void selectFromMakeAnyTab(String makeTab) {
        selectByVisibleTextFromDropDown(selectmakeAnyTab, makeTab);
        log.info("Select From make Any Tab" + selectmakeAnyTab.getText());
    }
    public void selectAnyModel(String model) {
        selectByValueFromDropDown(selectAnyModel, model);
        log.info("Select any model " + model + "into model field " + selectAnyModel.toString());
    }
    public void selectAnyLocation(String location) {
        selectByVisibleTextFromDropDown(selectAnyLocation, location);
        log.info("Select any location " + location + "into location field " + selectAnyLocation.toString());
    }
    public void selectLowPrice(String price) {
        selectByVisibleTextFromDropDown(selectLowPrice, price);
        log.info("Select price " + price + "into price field " + selectLowPrice.toString());
    }
    public void clickOnFindMyNextCarButton() {
        clickOnElement(searchMyCar);
        log.info("Click on find my next car " + searchMyCar.toString());
    }
    public String verifyMyMakeText() {
        log.info("Getting text from my make " + myMake.toString());
        return getTextFromElement(myMake);
    }
}