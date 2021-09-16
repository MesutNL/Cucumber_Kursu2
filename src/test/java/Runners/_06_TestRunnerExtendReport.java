package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = {"@Regression"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = { //basit rapor oluşturan plugin
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                //olusturulacak raporun yeri ve adi veriliyor.
        }

)
public class _06_TestRunnerExtendReport extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/test/java/XML_Files/ExtendReportSet.xml");
        Reporter.setSystemInfo("User Name","Mesüt Erbay");
        Reporter.setSystemInfo("Application Name","Mesüt Erbay");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Ek Satir","Aciklamasi");

        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");

    }
}
