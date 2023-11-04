package quruqa.com.registrationtests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class RegistrationTest extends BaseTest{
    @Test
    @Tag("remote")
    @DisplayName("Successful registration")
    void successfulRegistrationTest() {
        step("Open form", () -> {
            open("/automation-practice-form");
            $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
            executeJavaScript("$('#fixedban').remove()");
            executeJavaScript("$('footer').remove()");
        });
        step("add student name", () -> $("#firstName").setValue("Alex"));

        step("add student last name", () -> $("#lastName").setValue("Egorov"));
        step("add student email", () -> $("#userEmail").setValue("alex@egorov.com"));
        step("gender", () -> $("#genterWrapper").$(byText("Other")).click());
        step("phone", () -> $("#userNumber").setValue("1234567890"));
        step("add birthday", () -> {
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption("July");
            $(".react-datepicker__year-select").selectOption("2008");
            $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
        });
        step("add subject", () -> $("#subjectsInput").setValue("Math").pressEnter());
        step("add hobby", () -> $("#hobbiesWrapper").$(byText("Sports")).click());
        step("upload picture", () -> $("#uploadPicture").uploadFromClasspath("img/bug.jpg"));
        step("add current address", () -> $("#currentAddress").setValue("Some address 1"));
        step("state", () -> $("#state").click());
        step("stateCity", () -> $("#stateCity-wrapper").$(byText("NCR")).click());
        step("city", () -> $("#city").click());
        step("stateCity", () -> $("#stateCity-wrapper").$(byText("Delhi")).click());
        step("click submit", () -> $("#submit").click());
        step("check form", () -> {
            $(".modal-dialog").should(appear);
            $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
            $(".table-responsive").shouldHave(
                    text("Alex"),
                    text("Egorov"),
                    text("alex@egorov.com"),
                    text("1234567890")
            );
        });
    }
}
