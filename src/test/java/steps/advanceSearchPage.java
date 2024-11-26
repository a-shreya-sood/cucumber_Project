package steps;

//import org.testng.Assert;

import Actionss.AdvanceHome_Action;
import Actionss.CommonAction;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class advanceSearchPage {
	
	WebDriver driver;
	CommonAction comAction;
	AdvanceHome_Action advanceAction;
	public advanceSearchPage(CommonAction comAction,AdvanceHome_Action advanceAction) {
		this.comAction=comAction;
		this.advanceAction=advanceAction;
	}
	 
		@Given("I am advance seach page")
	public void i_am_advance_seach_page() 
		{
	
	 //driver.get("https://www.ebay.com/sch/ebayadvsearch");
	comAction.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
	 driver.manage().window().maximize();
	}

	@When("I click on ebay logo")
	public void i_click_on_ebay_logo() {
		//driver.findElement(By.xpath("//*[@id=\"gh-la\"]")).click();
		
		advanceAction.ebay_Logo();
	}

	@Then("I navigate back to ebay home page")
	public void i_navigate_back_to_ebay_home_page() 
	{
	    String expURL="https://www.ebay.com/";
	    String actual=driver.getCurrentUrl();
	    if(!expURL.equals(actual))
	    {
	    	Assert.fail("Not navigating")	;
	    }
	}
	
	@Given("I Advance Seach at an item")
	public void i_advance_seach_at_an_item(DataTable dataTable) throws InterruptedException  {
	  // driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1,0));
		advanceAction.search_String(dataTable.cell(1,0));
	   //driver.findElement(By.xpath("//input[@id=\"_ex_kw\"]")).sendKeys(dataTable.cell(1, 1));
		advanceAction.exclude_String(dataTable.cell(1, 1));
	   //driver.findElement(By.xpath("//input[@id=\"s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox\"]")).sendKeys(dataTable.cell(1, 2));
		advanceAction.Min(dataTable.cell(1, 2));
	   //driver.findElement(By.xpath("(//span[@class=\"floating-label\"]//input)[3]")).sendKeys(dataTable.cell(1, 3));
		advanceAction.Max(dataTable.cell(1, 3));
	   Thread.sleep(5000);
	   //driver.findElement(By.xpath("(//*[text()=\"Search\"])[2]")).click();
	   advanceAction.search_Button();
	  
	}


	


	}

	



