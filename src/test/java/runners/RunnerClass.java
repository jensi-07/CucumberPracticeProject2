package runners;
import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\SeleniumWorkSpace\\CucumberPracticeProject2\\src\\test\\java\\features\\hover.feature"},//the path of the feature files
		glue={"stepdefinations"}//step Defination Package Name
		)
public class RunnerClass {

}
