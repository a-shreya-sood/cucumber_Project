package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class advanceSearchElement {
 WebDriver driver;


	public advanceSearchElement(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
	@FindBy(xpath=("//*[@id=\\\"gh-la\\\"]"))
	public WebElement ebayLogo;
	
	@FindBy(xpath=("//input[@id='_nkw']\""))
	public WebElement searchString;
	
	@FindBy(xpath=("//input[@id=\\\"_ex_kw\\\"]"))
	public WebElement excludeString;
	
	@FindBy(xpath=("//input[@id=\\\"s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox\\\"]\""))
	public WebElement min;
	
	@FindBy(xpath=("//span[@class=\\\"floating-label\\\"]//input)[3]\""))
	public WebElement max;
	
	@FindBy(xpath=("//*[text()=\\\"Search\\\"])[2]"))
	public WebElement searchButton; 
	
	
	
}
