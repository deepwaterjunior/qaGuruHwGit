import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSomething extends TestBase {

    @Test
    void findCarsPicYandex() {

        open("/search");

        // test commit1234543
        $("#uniq16784632278721").click();


        System.out.println("test-test");
        System.out.println("lan");
        Scanner scanner = new Scanner("");
        String text = scanner.nextLine();
        System.out.println(text);

    }

}