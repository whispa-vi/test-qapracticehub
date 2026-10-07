import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MainPageTest {

    @Test
    public void titleTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://qapracticehub.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        assertEquals(driver.getTitle(), "QA Practice Hub — Free Website to Practice Test Automation (Selenium, Playwright, Cypress)");
    }
    @Test
    public void h1Test() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://qapracticehub.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        assertEquals(driver.findElement(By.tagName("h1")).getText(), "QA Practice Hub");
    }

}
