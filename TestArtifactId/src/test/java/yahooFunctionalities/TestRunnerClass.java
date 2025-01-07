package yahooFunctionalities;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "features", 
glue = {"yahooFunctionalities"}, 
monochrome=true,
plugin = {"pretty", "html:target/Reports/HtmlReports/CucumberHtmlReport.html",
                    "json:target/Reports/JsonReports/CucumberJsonReports.json",
                    "junit:target/Reports/XmlReports/CucumberXMLReport.xml"}
)
		                                     
public class TestRunnerClass {

}
