import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSomething extends TestBase {

    @Test
    void findCarsPicYandex() {

        open("/search");

        $("#uniq16784632278721").click();
        $("#uniq16784632278721").setValue("картинки автомобилей");
        $(".mini-suggest__button").click();

    }

}