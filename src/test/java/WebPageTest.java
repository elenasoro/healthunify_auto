import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebPageTest {
    private static final String PATH = "file:///Users/alenasa/IdeaProjects/healthunify_auto/src/test/resources/index.html";

    @Test
    public void elementsPresentTest() {
        // Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open url of web page
        driver.get(PATH);

        // Find elements
        boolean isWelcomeDisplayed = driver.findElement(By.id("welcome_title")).isDisplayed();
        boolean isSelectDisplayed = driver.findElement(By.id("select_form")).isDisplayed();
        boolean isButtonDisplayed = driver.findElement(By.id("click_button")).isDisplayed();

        // Add check
        driver.quit();
        Assert.assertTrue(isWelcomeDisplayed);
        Assert.assertTrue(isSelectDisplayed);
        Assert.assertTrue(isButtonDisplayed);
    }

    @Test
    public void namePresentTest() {
        // Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open url of web page
        driver.get(PATH);

        // Find elements
        boolean isNameDisplayed = driver.findElement(By.id("intro_text")).getText().contains("Elena");

        // Add check
        driver.quit();
        Assert.assertTrue(isNameDisplayed);
    }

    @Test
    public void linkTest() {
        // Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open url of web page
        driver.get(PATH);

        // Click on link
        String address = driver.findElement(By.id("w3link")).getAttribute("href").toString();
        driver.findElement(By.id("w3link")).click();

        // Add check
        Assert.assertEquals(address, driver.getCurrentUrl());
        driver.quit();
    }

    @Test
    public void altTextTest() {
        // Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open url of web page
        driver.get(PATH);

        // Click on link
        String altText = driver.findElement(By.id("panda_img")).getAttribute("alt");

        // Add check
        driver.quit();
        Assert.assertEquals("Oops, you found it", altText);
    }

}
