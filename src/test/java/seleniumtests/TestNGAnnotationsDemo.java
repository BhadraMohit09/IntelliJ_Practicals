package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import static org.testng.Assert.assertEquals;

public class TestNGAnnotationsDemo {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Test");

        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void googleTitleTest() {
        System.out.println("Running Google Title Test");

        String actualTitle = driver.getTitle();

        assertEquals(actualTitle, "Google");
    }

    @Test
    public void googleUrlTest() {
        System.out.println("Running Google URL Test");

        String actualUrl = driver.getCurrentUrl();

        assertEquals(actualUrl, "https://www.google.com/");
    }

    @Test
    public void googlePageTest() {

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        assertEquals(title, "Google");

        assertTrue(title.contains("Google"));

        assertFalse(url.isEmpty());
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Test");

        driver.quit();
    }
}