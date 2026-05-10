package stepdefinations;
import org.openqa.selenium.*;
import io.cucumber.java.en.*;
import java.time.*;
import org.openqa.selenium.support.ui.*;
import pages.hrmLoginpage;
import utilities.Driverfactory;
public class hrmLoginStepdefination {
    WebDriver driver = Driverfactory.setupDriver();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    hrmLoginpage loginPage = new hrmLoginpage(driver);
    @Given("I am on the HRM login page")
    public void loginPage(){
        loginPage.openHrm();
    }
    // public void loginPage(){
    //     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    // }
    @When("I enter valid username and password")
    public void credential(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("admin123");
    }
    @And("I click the login button")
    public void loginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
    }
    @Then("I should be redirected to the dashboard page and apply for leave")
    public void dashBoardpage(){
        String CurrentUrl = driver.getCurrentUrl();
        if(CurrentUrl.contains("dashboard")){
            System.out.println("Login successful and redirected to dashboard page");
            // Add code to apply for leave
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Apply Leave']"))).click();
            String txt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']"))).getText();
            if(txt.equals("No Leave Types with Leave Balance")){
                System.out.println("No leave types with leave balance available");
                Driverfactory.tearDown();
            }
            else{
                System.out.println("Leave types with leave balance available");
            }

        }else{
            System.out.println("Login failed or not redirected to dashboard page");
        }
        Driverfactory.tearDown();
    }
}
