package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class commonSteps {

	private WebDriver driver;
	
	
	@Before(order=0)
	public void setUp() {
		driver=new ChromeDriver();
		System.out.println("global based hook executed");
	}
	
	
	@After(order=0)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[]screenshot=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png",scenario.getName());
			}
		
		System.out.println("global after hook executed");
		driver.quit();
	}

	
	
	public WebDriver getDriver() {
		return driver;
	}
}
