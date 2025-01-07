package yahooFunctionalities;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
( features = {"C:\\Users\\shubham\\eclipse-workspace\\TestArtifactId\\features\\Background_Demo.feature"},
glue = {"background_Demo"},
plugin = {"json:target/cucumber.json"}
)
		                                     
public class RunnerClassTestForReporting {

}
