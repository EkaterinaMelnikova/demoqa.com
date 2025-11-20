package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {
    private final String titleText ="Practice Form";

    public PracticeFormPage openPage(){
        open("/automation-practice-form");
        $(".text-center").shouldHave(text(titleText));
//        executeJavaScript("$('#fixedban').remove()");
//        executeJavaScript("$('footer').remove()");

        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        $("#firstName").setValue(value);

        return this;
    }
}
