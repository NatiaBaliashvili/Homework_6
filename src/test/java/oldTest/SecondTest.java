package oldTest;

import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SecondTest extends ChromeRunner{
    @Test
    public void googleTest_1(){

        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("მობილური").pressEnter();
        $(byClassName("button-section")).$(byClassName("add_to_cart")).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible, Duration.ofMillis(5000));
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        $(byClassName("btn-cart")).click();

        sleep(3000);
    }
}
