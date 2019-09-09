package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utilities.DriverUtil;


@RunWith(Cucumber.class)
    @CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html","pretty","html:target/cucumber",
            "json:target/cucumber-report.json"},
            features = {"./src/test/resources"},
            tags = {"@Test"},
            glue = {"stepsDefinitions"},
            monochrome = true
    )

    public class RunnerClass extends DriverUtil {
        @BeforeClass
        public static  void startSession()throws  InterruptedException{
            DriverUtil driverUtil = new DriverUtil();
            driverUtil.setDriver("firefox");
            String Url = "http://thedemosite.co.uk";
            driver.get(Url);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            Thread.sleep(5000);
        }
    }
