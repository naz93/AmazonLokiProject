package upskill.amazon.pageAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.amazon.pageElements.HomePageLocator;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class HomePageAction {
	HomePageLocator HomePageLocatorObj;
	
	public HomePageAction(){
		HomePageLocatorObj =new HomePageLocator();
		PageFactory.initElements(SetupDrivers.driver, HomePageLocatorObj);
	}

	public void  selectWholeFoodsMarket() throws Exception {
	Select dropDown = new Select(HomePageLocatorObj.dropDownSearch);
	dropDown.selectByVisibleText("Whole Foods Market");
	Thread.sleep(1000);
}
	public void SearchBagels() throws Exception{
	//	HomePageLocatorObj.txtboxsearch.sendKeys("Bagel");
		HomePageLocatorObj.txtboxsearch.sendKeys(ReadExcelSheet.getMapData("Amazon WF"));

		HomePageLocatorObj.txtbuttonsearch.click();
	}
	
	public void  selectAmazonFresh() throws Exception {
		Select dropDown = new Select(HomePageLocatorObj.dropDownSearch2);
		dropDown.selectByVisibleText("Amazon Fresh");
		Thread.sleep(1000);
		}
	public void SearchYogurt() throws Exception{
		//HomePageLocatorObj.txtboxsearch.sendKeys("Yogurt");
		HomePageLocatorObj.txtboxsearch.sendKeys(ReadExcelSheet.getMapData("Amazon Fresh"));

		HomePageLocatorObj.txtbuttonsearch.click();
		
	}

	public void MouseHoverAccount() throws Exception{
	Actions actions = new Actions(SetupDrivers.driver);
	actions.moveToElement(HomePageLocatorObj.linkAccountAndLists);
	actions.perform();
	Thread.sleep(2000);
}
	public void clickMusicLibrary() throws Exception{
		HomePageLocatorObj.linkMusicLibrary.isEnabled();
		HomePageLocatorObj.linkMusicLibrary.click();
		Thread.sleep(2000);
	}
	
	public void clickTodaysDeals() throws Exception{
		HomePageLocatorObj.clickTodaysDeals.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}