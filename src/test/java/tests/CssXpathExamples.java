package tests;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CssXpathExamples {
    void cssXpath(){

        $("[data-testid=email]").setValue("1"); //ищеи через css
        $x("//*[@data-testid='email']").setValue("1"); //через xpath


    }
}
