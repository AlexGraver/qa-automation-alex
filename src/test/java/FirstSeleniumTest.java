import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstSeleniumTest {
    //Локаторы указывают в теле основного метода
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    @Test
    public void openHomePageCheck() {
        //Если тест выдает ошибку по драйверу, то используем set.Property и указываем путь, куда скачали драйвер
        System.setProperty("webdriver.chome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize(); //open browser on whole screen (recommended)
        browser.get("http://www.discovercars.com/");

        //Задаем ожидание необходимого элемента в единицах времени
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        //Действие с элементом, который нашли по локатору, который указан в поле видимости основного метода
        browser.findElement(ACCEPT_COOKIES_BTN).click();



        /*Указание локатора элемента для нахождения его на странице программой.
        Начало с // - поиск по всему окну браузера
        Начало с .// - поиск внутри элемента. (Рекомендуемый вариант)

        Пример локатора:
        .//label[@for = 'is-drop-off']  поиск по label for (локатор ищем через devtools)
        Пример:
        .//*[contains(@class, 'typehead pick')]

        By.id("element-id");
        By.name("input-field-name");
        By.xpath(".//label[@for = 'is-drop-off']")
         */

    }
}
