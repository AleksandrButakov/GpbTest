package step;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.*;

public class PageBase {
    // локатор кнопки приянятия cookies
    private final SelenideElement buttonAcceptCookiesFiles = $$(".button_root__text--fadd5")
            .findBy(Condition.text("Принять и продолжить"));
    // локатор ссылки "Частным клиентам" главной страницы
    private final SelenideElement privateClients = $$(".header_full_main_root__link--c1e2d")
            .findBy(Condition.text("Частным клиентам"));

    @And("Нажимаем кнопку принятия файлов cookies")
    public void нажимаемКнопкуПринятияФайловCookies() {
        buttonAcceptCookiesFiles.click();
    }

    @When("Проверка нахождения на главной странице")
    public void проверкаНахожденияНаГлавнойСтранице() {
        privateClients.click();
        sleep(6000);
    }




}
