package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public UsedPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedTab;

    public void clickonUsedTab(){
        clickOnElement(usedTab);
    }
}
