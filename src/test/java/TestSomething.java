import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSomething extends TestBase {

    @Test
    void findCarsPicYandex() {

        open("/search");

        // test commit1234543
        $("#uniq16784632278721").setValue("картинки автомобилей");
        $(".mini-suggest__button").click();
        testConfig();

    }

}