import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void testConfig() {

        Configuration.baseUrl = "https://ya.ru/";
        Configuration.browser = "Chrome";
        Configuration.holdBrowserOpen = true;


    }
}
