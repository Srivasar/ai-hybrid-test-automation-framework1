package stepdefinations;
import org.openqa.selenium.*;
import io.cucumber.java.en.*;
import utilities.Driverfactory;
import pages.hrmLoginpage;
import pages.dashboard;
public class dashbaordStepdefination {
    WebDriver driver = Driverfactory.setupDriver();
    hrmLoginpage loginPage = new hrmLoginpage(driver);
    dashboard dash = new dashboard(driver);
    @Given("User should be on the login page")
    public void user_should_be_on_the_login_page(){
        loginPage.openHrm();
    }
    @And("User should logged in with valid credentials")
    public void user_should_logged_in_with_valid_credentials(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @When("User should click on the dashboard")
    public void user_should_click_on_the_dashboard(){
        // Add implementation here
    }
    
}
