package mavenDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Presentation {

    @Test
    public void testCaseTwo(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.facebook.com/");
//        driver.manage().window().maximize();
//        driver.quit();

        Assert.assertFalse(3<5);
        }
    }
