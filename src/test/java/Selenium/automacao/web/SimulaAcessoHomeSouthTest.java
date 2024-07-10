package Selenium.automacao.web;

import Selenium.automacao.web.pageobject.HomeSouthPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.*;

public class SimulaAcessoHomeSouthTest {

    private WebDriver driver;

    @Test
    void testaAcessoHome() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();

        open("https://southsystem.com.br/");

        var homeSouthPage = new HomeSouthPage();
        homeSouthPage
                .selecionaVagas();
        refresh();
    }

    @AfterEach
    void deveriaFecharTelaeBrowser() {
        driver.quit();
    }
}

