package pages;
import org.openqa.selenium.*;
public class hrmLoginpage {
    WebDriver driver;
    public hrmLoginpage(WebDriver driver) {
        this.driver = driver;
    }
    public void openHrm(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public String getTitle(){
        return driver.getTitle();
    }
}