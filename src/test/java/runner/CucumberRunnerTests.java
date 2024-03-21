package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(tags = "", features = "src/test/resources/feature", glue = "com.mobile",
        plugin = {"pretty","html:target/cucumber-reports/reports2.html","json:target/cucumber.json"},
        monochrome = true

)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
