package page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import utils.GenderClass;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationForm {

    SelenideElement firstNameField = $("input#firstName");
    SelenideElement lastNameField = $("input#lastName");
    SelenideElement userEmailField = $("input#userEmail");

    SelenideElement userPhoneNumberField = $("input#userNumber");

    SelenideElement dateOfBirthField = $("input#dateOfBirthInput");
    SelenideElement dateOfBirthCalendare = $("div.react-datepicker__month-container");

    public void setFirstName(String firstName) {
        firstNameField.setValue(firstName);
    }

    public void setLastName(String lastName) {
        lastNameField.setValue(lastName);
    }

    public void setEmail(String userEmail) {
        userEmailField.setValue(userEmail);
    }

    public void setGender(GenderClass gender) {
        $("input#gender-radio-" + gender.id).click();
    }

    public void setUserPhoneNumber(String phone) {
        userPhoneNumberField.setValue(phone);
    }

    public void setBirthDate(int day, int month, int year) {
        dateOfBirthField.click();
        dateOfBirthCalendare.shouldBe(Condition.visible);


    }



}
