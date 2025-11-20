package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {
    private final String titleText ="Practice Form";

    public void openPage(){
        open("/automation-practice-form");
        $(".text-center").shouldHave(text(titleText));
//        executeJavaScript("$('#fixedban').remove()");
//        executeJavaScript("$('footer').remove()");


    }

    public void setFirstName(String value) {
        $("#firstName").setValue(value);
    }
}
