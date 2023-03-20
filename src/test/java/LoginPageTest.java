import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps log = new LoginPageSteps();
    @Test
    public void UserNameOrPassword(){

              log.LoginBtnClick()
               .EmailInput(email)
                .PasswordInput(password);
               //.LoginBtn();
            // Assert.assertTrue(LoginPageSteps.loginError.is(Condition.visible));
               sleep(5000);

    }
}
