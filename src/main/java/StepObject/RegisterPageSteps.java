package StepObject;

import PageObject.RegisterPage;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.files.DownloadActions;
import org.w3c.dom.html.HTMLInputElement;
import com.codeborne.selenide.ClickOptions;
import java.time.Duration;

import static PageObject.LoginPage.*;

public class RegisterPageSteps extends RegisterPage {
    public RegisterPageSteps EmailInput(String email){
        emailInput.setValue(email);
        return this;

    }

    public RegisterPageSteps PasswordInput(String password){
        passwordInput.setValue(password).sendKeys();
        return this;
    }

    public RegisterPageSteps registerBtnclick(){

        registerBtn.click();
        return this;
    }
   // public RegisterPageSteps LoginBtn(){


      /*  registerBtn.click(ClickOptions.withTimeout(Duration.ofMillis(5000));

        loginError.shouldBe(Condition.visible, Duration.ofMillis(10000));
        return this;
    }*/



}
