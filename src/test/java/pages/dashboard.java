package pages;
import org.openqa.selenium.*;

public class dashboard {
    WebDriver driver;
    public dashboard(WebDriver driver){
        this.driver = driver;
    }
    public String getTitle(){
        return driver.getTitle();
    }
}