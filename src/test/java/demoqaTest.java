import io.github.bonigarcia.seljup.SeleniumJupiter;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.ProfilePage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SeleniumJupiter.class)

public class demoqaTest {
    @Test
    @Owner("Andropov")
    @DisplayName("Сценарий 1")
    @Description(
            "Открыть страницу https://demoqa.com/login\n" +
            "Ввести логин и пароль\n" +
            "Перейти в раздел https://demoqa.com/profile\n" +
            "Проверить, что таблица пустая")

    public void demoqaTest(@NotNull ChromeDriver browser) {
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        LoginPage loginPage = new LoginPage(browser);
        loginPage.loadPage();
        loginPage.auth();
        ProfilePage profilePage = new ProfilePage(browser);
        assertTrue(profilePage.TableEmpty());
    }
}