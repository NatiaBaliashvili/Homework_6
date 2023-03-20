package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byName;
public class RegisterPage {

    public static SelenideElement


    firstNameInput = $(byId("firstName")),
    lastNameInput = $(byId("lastName")),
    emailInput = $(byId("email")),
    passwordInput = $(byId("password")),
    confirmInput = $(byId("confirmPassword")),
    singupInput = $(byId("singup")),
    registerBtn = $(byClassName("btn-register"),0);
}


