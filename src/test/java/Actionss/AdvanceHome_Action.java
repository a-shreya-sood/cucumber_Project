package Actionss;

import org.openqa.selenium.WebDriver;

import Elements.advanceSearchElement;
import steps.commonSteps;

public class AdvanceHome_Action {
	
	private WebDriver driver;
	 public advanceSearchElement as;
	
	public AdvanceHome_Action(commonSteps cs) {
		this.driver=cs.getDriver();
		as=new advanceSearchElement(driver);
	}
	
	public void ebay_Logo() {
		as.ebayLogo.click();
	}
	
	public void search_String(String str) {
		as.searchString.sendKeys(str);
	}
	
	public void exclude_String(String str) {
		as.excludeString.sendKeys(str);
	}
	
	public void Min(String str) {
		as.min.sendKeys(str);
	}
	
	public void Max(String str) {
		as.max.sendKeys(str);
	}
	
	public void search_Button() {
		as.searchButton.click();
	}
	

}
