package pages;

import org.openqa.selenium.WebDriver;
import provider.Provider;

public class MainPage {
    protected WebDriver driver;
    protected Url currentPage;

    public MainPage(WebDriver driver, Url page) {
        this.driver = driver;
        this.currentPage = page;
    }

    public void loadPage(){
        driver.get(Provider.getUrlFromProperties(currentPage));
    }
}