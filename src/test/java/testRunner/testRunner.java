package testRunner;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"features"},
		glue= {"steps"},
		plugin= {"pretty","json:Reports/json.myReport/cucumber.json"},
		dryRun=false, 
		monochrome=true,
		//dryRun = true,
		tags= "@P1 and @P2"
		
)
public class testRunner {

}
	