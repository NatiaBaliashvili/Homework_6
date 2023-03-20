package oldTest;

import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;


public class FirstTest extends ChromeRunner {
    @Test
    public void googleTest(){


         $(byId("rcc-confirm-button")).click();
         $(byClassName("btn-register")).click();
         $(byId("firstName")).setValue("Natia").shouldNotBe(Condition.empty, Duration.ofMillis(5000));
         $(byId("lastName")).setValue("Baliashvili").shouldNotBe(Condition.empty, Duration.ofMillis(5000));
         $(byId("email")).setValue("gnatiabaliashvili@gmail.com").shouldNotBe(Condition.empty);
         $(byId("password")).setValue("Testtest1").shouldNotBe(Condition.empty);
         $(byId("confirmPassword")).setValue("Testtest1").shouldNotBe(Condition.empty);
         $(byId("singup")).click();
         $(byId("singup")).shouldNotBe(Condition.empty);


         sleep(3000);
    }


}
