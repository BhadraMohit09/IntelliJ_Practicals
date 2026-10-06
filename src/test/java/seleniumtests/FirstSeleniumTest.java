package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

    static void main() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}