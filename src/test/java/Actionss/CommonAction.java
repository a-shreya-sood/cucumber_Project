package Actionss;

import org.openqa.selenium.WebDriver;

import steps.commonSteps;

public class CommonAction {

	private WebDriver driver;
	commonSteps cs;
	
	public CommonAction(WebDriver driver) {
		this.driver=cs.getDriver();
	}
	
	public void goToUrl(String url)
	{
		driver.get(url);
	}
	
	public String currentPageUrl()
	{
	  return driver.getCurrentUrl();	
	}
	
	public String currentTitle()
	{
		return driver.getTitle();
	}
	
	public void quitWebDriver() {
		driver.quit();
	}
}
