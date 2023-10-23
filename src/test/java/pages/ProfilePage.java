package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends MainPage {
    @FindBy(css = ".rt-noData")
    private WebElement noRowsNotification;

    public ProfilePage(WebDriver driver) {
        super(driver, Url.PROFILE);
        PageFactory.initElements(driver, this);
    }

    public boolean TableEmpty() {
        return noRowsNotification.isDisplayed();
    }
}