package utilities;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class Driverfactory {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebDriver setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;  
    }
    public static void tearDown(){
       driver.quit();
    }
}
