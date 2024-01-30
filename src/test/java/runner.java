import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/feature/login.feature"},
        glue = {"base","step.definition"},
        plugin = {"html:target/result","pretty","json:target/test-classes/reports/result.json"})
public class runner extends AbstractTestNGCucumberTests {
}
