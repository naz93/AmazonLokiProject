package upskill.amazon.pageAction;

import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.amazon.pageElements.SearchResultLocator;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class SearchResultAction {
	SearchResultLocator SearchResultLocatorObj;
	
	public SearchResultAction(){
		SearchResultLocatorObj = new SearchResultLocator();
		PageFactory.initElements(SetupDrivers.driver, SearchResultLocatorObj);
		 
	}
	
	public void clickMap() throws Exception{
		SearchResultLocatorObj.clickMap.click();
		Thread.sleep(2000);
	}
	//HomePageLocatorObj.txtboxsearch.sendKeys("bagel");
	//HomePageLocatorObj.txtbuttonsearch.click();
	public void putZip() throws Exception{
		//SearchResultLocatorObj.txtZip.sendKeys("11101");
		SearchResultLocatorObj.txtZip.sendKeys(ReadExcelSheet.getMapData("zip"));

	}
	public void clickApply(){
		SearchResultLocatorObj.clickApply.click();
		
	}
	
	public void clickDone() throws Exception{
		SearchResultLocatorObj.clickDone.click();
		Thread.sleep(2000);

	}
	public void varifyBagelItems() throws Exception{
		SearchResultLocatorObj.txtBagel.isDisplayed();
		Thread.sleep(2000);
	}
	
	public void varifyYogurtItems() throws Exception{
		SearchResultLocatorObj.txtYogurt.isDisplayed();
		Thread.sleep(2000);
		
	
	}
	
	public void selectPrime() throws Exception{
		SearchResultLocatorObj.cbxPrime.click();
		Thread.sleep(2000);
	}
}
