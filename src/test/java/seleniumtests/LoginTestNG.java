package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTestNG {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void validLoginTest() {

        // Enter username
        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

        // Click Login
        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        // Verify successful login
        String pageText = driver.findElement(By.tagName("body"))
                .getText();

        assertTrue(pageText.contains("You logged into a secure area!"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}