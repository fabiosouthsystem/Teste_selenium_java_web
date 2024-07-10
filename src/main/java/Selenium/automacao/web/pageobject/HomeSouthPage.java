package Selenium.automacao.web.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class HomeSouthPage {

    SelenideElement botaoVagas = $(byLinkText("https://vagas.jobii.com.br/vagas"));
    Duration duracaoPadrao = Duration.ofSeconds(70);

    public HomeSouthPage selecionaVagas() {
        botaoVagas.shouldBe(Condition.visible, duracaoPadrao);
        botaoVagas.click();
        return this;
    }
}
