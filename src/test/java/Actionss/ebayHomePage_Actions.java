package Actionss;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Elements.ebayHomeElement;
import steps.commonSteps;

public class ebayHomePage_Actions {

	ebayHomeElement eb;
	
	private WebDriver driver;
	public ebayHomePage_Actions(commonSteps cs) {
		this.driver=cs.getDriver();
		eb=new ebayHomeElement(driver);
	}
	
	
	public void advanced_Button()
	{
		eb.advancedButton.click();
	}
	
	public void search_String_Button(String str) 
	{
		eb.searchStringButton.sendKeys(str);
	}
	
	public void search_Button() 
	{
		eb.searchButton.click();
	}
	
	public void cat_Options(String option) {
		 List<WebElement>cat=(List<WebElement>) eb.catOptions;
		 for(WebElement x:cat) {
			 if(x.getText().trim().toLowerCase().equals(option.toLowerCase())){
				 x.click();
				 break;
			 }
		 }
	}
	
	public int search_Items(int count)
	{
		String text	=eb.searchItems.getText().trim();
		String text1=text.replace(",","");
		int textCount=Integer.parseInt(text1);
		return textCount;
		
	}
	 
	
}
