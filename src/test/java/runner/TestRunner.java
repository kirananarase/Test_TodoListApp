package runner;

import base.DriverHandler;
import com.cucumber.listener.Reporter;
import com.report.CucumberExtentOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;
import resources.ConfigFileReader;

import java.io.File;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
        tags = {"@todoitems"},
        monochrome = true,
        plugin = {"com.report.CucumberExtent:report/report.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void beforeMethod() {
        CucumberExtentOptions.getInstance().setDocumentTitle("Todo List App");
        //CucumberExtentOptions.getInstance().setReportLevel("Feature");
        CucumberExtentOptions.getInstance().setReportName("TODO List App Report");
    }
}
