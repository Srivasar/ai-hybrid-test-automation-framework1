package runners;
import io.cucumber.testng.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
    features ="src/test/resources/features/login.feature",
    glue="stepdefinations",
    plugin = {"pretty","html:target/cucumber-reports.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
