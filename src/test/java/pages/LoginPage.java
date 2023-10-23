package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import provider.Provider;

public class LoginPage extends MainPage {
    @FindBy(id = "userName")
    private WebElement userNameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver, Url.LOGIN);
        PageFactory.initElements(driver, this);
    }

    public void auth(){
        userNameInput.sendKeys(Provider.getUserName());
        passwordInput.sendKeys(Provider.getPassword());
        loginButton.click();
    }
}