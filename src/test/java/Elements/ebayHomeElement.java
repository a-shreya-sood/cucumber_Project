package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebayHomeElement {

	WebDriver driver;
	
	public ebayHomeElement(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath=("//*[text()='Advanced']"))
	public WebElement advancedButton;
	
	@FindBy(xpath=("//*[@id=\"gh-ac\"]"))
	public WebElement searchStringButton;
	
	@FindBy(xpath=("//*[@id=\"gh-btn\"]"))
	public WebElement searchButton;
	

	@FindBy(xpath=("//select[@id=\\\"gh-cat\\\"]/option"))
	public WebElement catOptions;
	
	@FindBy(xpath=("//div[@class=\"srp-controls__row-cells\"]/div[1]//span[1]"))
	public WebElement searchItems;
}
