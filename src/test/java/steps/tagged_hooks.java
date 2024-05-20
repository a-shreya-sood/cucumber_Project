package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class tagged_hooks {
	WebDriver driver;
	public tagged_hooks(commonSteps cs) {
		this.driver=cs.getDriver();
	}
	 

	@Before(value="@setCookies",order=1)
	public void setCookies() {
		System.out.println("scenario based hook executed");
	}
	
	@After(value="@Test",order=1)
	public void afterHook() {
		System.out.println("scenario after hook executed");
	}
	
}
