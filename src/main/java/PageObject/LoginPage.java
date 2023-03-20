package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

        public static SelenideElement
              emailInput = $(byName("userName")),
              passwordInput = $(byName("password")),
             // loginBtn = $(".btn-darkred"),
             // loginError = $(byText("მომხმარებლის სახელი და პაროლი არასწორია")),

             registerBtn = $(byClassName("btn-register"),1);


       /* public ElementsCollection
              test = $$("dssfd");*/

}
