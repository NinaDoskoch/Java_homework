import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.jupiter.api.BeforeEach;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

public class RayBanSmokeTests {
    private WebDriver driver;
    private ChromeOptions options;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://192.168.1.13:4444"), options);
  
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    
    @Test
    public void mainPageLoads() {
        driver.get("https://www.ray-ban.com/spain");
        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains("Ray-Ban"));
    }

    @Test
    public void logoIsPresent() {
        driver.get("https://www.ray-ban.com/spain");
        
        WebElement logoElement = driver.findElement(By.cssSelector("a[data-element-id='X_X_MainNav_Logo'] img[src='/rbstatichtml/assets/images/red-logo.svg']"));
        assertTrue(logoElement.isDisplayed());
    }

    @Test
    public void glassesLinkRedirects() {
        driver.get("https://www.ray-ban.com/spain");
        WebElement glassesLink = driver.findElement(By.cssSelector("a[href='https://www.ray-ban.com/spain/gafas-de-sol/hombre']"));
        glassesLink.click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://www.ray-ban.com/spain/gafas-de-sol/hombre"));
        
    }   
    }

