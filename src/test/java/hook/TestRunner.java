package hook;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(plugin = {"json:target/cucumber-report.json","html:target"}
,features = "D:/git-projects/cucumberVer4/src/test/features"
,extraGlue = "abhishek8908.stepdefs"
,monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{
    @Test(dataProvider = "scenarios")

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
