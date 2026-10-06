package seleniumtests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

public class GoogleTitleTestNG {

    @Test
    public void googleTitleTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle();

        assertEquals(actualTitle, "Google");

        driver.quit();
    }
}