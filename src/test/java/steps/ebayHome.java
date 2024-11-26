package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import Actionss.CommonAction;
import Actionss.ebayHomePage_Actions;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.*;


public class ebayHome {

	public WebDriver driver;
	public ebayHomePage_Actions ebayHome;
	public CommonAction comAction;
	
	public ebayHome(ebayHomePage_Actions ebayHome,CommonAction comAction) {
		this.ebayHome= ebayHome;
		this.comAction=comAction;
	}

		@Given("I am on Ebay Home Page")
		public void i_am_on_ebay_home_page() {
		    // Write code here that turns the phrase above into concrete actions
			//driver.get("https://www.ebay.com/");
			comAction.goToUrl("https://www.ebay.com/");
			driver.manage().window().maximize();			
		   
		}

		@When("I click on Advanced button")
		public void i_click_on_advanced_button() {
		    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//*[text()='Advanced']")).click();
		     ebayHome.advanced_Button();
			 System.out.println("I am on advance page");
		}

		@Then("I navigate to Advanced search link")
		public void i_navigate_to_advanced_search_link() {
		    String expURL="https://www.ebay.com/sch/ebayadvsearch";
		    String actualURL=comAction.currentPageUrl();
		    if(!expURL.equals(actualURL))
		    {
		    	Assert.fail("Page is not same.");
		    }
		    System.out.println("I am on advance search link");
		}
		
		@When("I search for {string}")
		public void i_search_for_iphone11(String str) {
		    //driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(str);
			ebayHome.search_String_Button(str);
		    //driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
			ebayHome.search_Button();
            
		}
		
		
		
		@When("I search for {string} in the {string} category")
		public void i_search_for_in_the_category(String string1, String string2) {
			 //driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(string1);
			 ebayHome.search_String_Button(string1);
			 ebayHome.cat_Options(string2);
//			 List<WebElement>cat=driver.findElements(By.xpath("//select[@id=\"gh-cat\"]/option"));
//			 for(WebElement x:cat) {
//				 if(x.getText().trim().toLowerCase().equals(string2.toLowerCase())){
//					 x.click();
//				 }
//			 }
			    
			 //driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
			 ebayHome.search_Button();
		    
		}

		@Then("validate atleast {int} search items present")
		public void validate_atleast_search_items_present(int count) {
		    
			int textCount=ebayHome.search_Items(count);
//		String text	=driver.findElement(By.xpath("//div[@class=\"srp-controls__row-cells\"]/div[1]//span[1]")).getText().trim();
//		String text1=text.replace(",","");
//		int textCount=Integer.parseInt(text1);
		
		if(textCount<=count)
		{
			Assert.fail("Less than 1000 results");
		}
		}
		

  @When("I click on {string}")
public void i_click_on(String string) {
	driver.findElement(By.linkText(string)).click();
    
}

@Then("I validate the {string} and {string}")
public void i_validate_the_and(String url, String title) {
	String actUrl=comAction.currentPageUrl();
	if(!actUrl.equals(url)) {
		Assert.fail("Page not loading"+url);
	}
	
	String actTitle=comAction.currentTitle();
	if(!actTitle.contains(title)) {
		Assert.fail("Title not found"+title);
	}
    
}



		
		}

