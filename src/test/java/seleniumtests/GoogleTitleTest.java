package seleniumtests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTitleTest {

    @Test
    void googleTitleTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle();

        assertEquals("Google", actualTitle);

        driver.quit();
    }
}