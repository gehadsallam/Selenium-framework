package runner;



import io.cucumber.testng.CucumberOptions;
import io.cucumber.core.cli.Main;
import tests.Testbase;


@CucumberOptions(features = "src/test/java/features",glue = {"stepdefinitions"},plugin = {"pretty","html:target/cucmber-html-report"})
public class TestRunner extends Testbase {

	
	
	
	
	
}
