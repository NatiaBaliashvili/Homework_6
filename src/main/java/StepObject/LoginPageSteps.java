package StepObject;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;

import static DataObject.LoginPageData.email;
import static PageObject.RegisterPage.registerBtn;

public class LoginPageSteps extends LoginPage {

   public LoginPageSteps EmailInput(String email){
        emailInput.setValue(email);
        return this;

    }
    public LoginPageSteps PasswordInput(String password){
        passwordInput.setValue(password);
        return this;
    }
    public LoginPageSteps LoginBtnClick(){
        registerBtn.click();
        return this;
    }


  /*  public LoginPageSteps LoginBtn(){
        loginBtn.click();
        loginError.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
   /* public LoginPageSteps LoginBtnClick(){
        loginBtn.click();
        return this;
    }*/
      /*public LoginPageSteps SuccessfullLogin(String email, String password){
        EmailInput(email);
        PasswordInput(password);
        registerBtn.click();
        return this;


    }*/

}
