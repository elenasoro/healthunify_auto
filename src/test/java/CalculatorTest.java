import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void normalTest() {
        // Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open url of calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        // Input weight
        driver.findElement(By.name("wg")).sendKeys("50");

        // Input height
        driver.findElement(By.name("ht")).sendKeys("160");

        // Click on calculate button
        driver.findElement(By.cssSelector("[value=Calculate]")).click();


        // Add check
        String normalText = "";
        try {
            normalText = driver.findElement(By.name("desc")).getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
            driver.quit();
        }

        driver.quit();
        Assert.assertEquals(normalText, "Your category is Normal");
    }

    @Test
    public void starvationTest() {
        // Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open url of calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        // Input weight
        driver.findElement(By.name("wg")).sendKeys("20");

        // Input height
        driver.findElement(By.name("ht")).sendKeys("160");

        // Click on calculate button
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        // Add check
        String starvationText = "";
        try {
            starvationText = driver.findElement(By.name("desc")).getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
            driver.quit();
        }
        driver.quit();
        Assert.assertEquals(starvationText, "Your category is Starvation");
    }

    @Test
    public void underweightTest() {
        // Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open url of calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        // Input weight
        driver.findElement(By.name("wg")).sendKeys("40");

        // Input height
        driver.findElement(By.name("ht")).sendKeys("160");

        // Click on calculate button
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        // Add check
        String underweightText = "";
        try {
            underweightText = driver.findElement(By.name("desc")).getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
            driver.quit();
        }
        driver.quit();
        Assert.assertEquals(underweightText, "Your category is Underweight");
    }

    @Test
    public void overweightTest() {
        // Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open url of calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        // Input weight
        driver.findElement(By.name("wg")).sendKeys("70");

        // Input height
        driver.findElement(By.name("ht")).sendKeys("160");

        // Click on calculate button
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        // Add check
        String overweightText = "";
        try {
            overweightText = driver.findElement(By.name("desc")).getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
            driver.quit();
        }
        driver.quit();
        Assert.assertEquals(overweightText, "Your category is Overweight");
    }

    @Test
    public void obeseTest() {
        // Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open url of calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        // Input weight
        driver.findElement(By.name("wg")).sendKeys("80");

        // Input height
        driver.findElement(By.name("ht")).sendKeys("160");

        // Click on calculate button
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        // Add check
        String obeseText = "";
        try {
            obeseText = driver.findElement(By.name("desc")).getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
            driver.quit();
        }
        driver.quit();
        Assert.assertEquals(obeseText, "Your category is Obese");
    }
}
