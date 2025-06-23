package hw_tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {

    @BeforeAll
    static void setUp(){

        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
    }


    @Test
    void checkHeaderTest() {

        open("");

        $(withTagAndText("button","Solutions")).hover();
        $(withTagAndText("a","Enterprises")).click();

        // Проверяем, что загрузилась страница с заголовком "The AI-powered developer platform"
        $("[data-testid='Hero']").shouldHave(text("The AI-powered developer platform"));

    }
}
