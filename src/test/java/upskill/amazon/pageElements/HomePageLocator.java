package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocator {
	//search WF dropdown
	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	public WebElement dropDownSearch;
	
	
	//searchtxt box
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement txtboxsearch;
	
	//search button 
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement txtbuttonsearch;
	
	//search AF dropdown
	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	public WebElement dropDownSearch2;
		
		
	// link Account lists
		@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
		public WebElement linkAccountAndLists;
	
	// link Account lists
		@FindBy(xpath = "(//span[normalize-space()='Music Library'])[1]")
		public WebElement linkMusicLibrary;
		
	// click on todays deal
		
		@FindBy(xpath="//a[@href='/deals?ref_=nav_cs_gb']")
		public WebElement clickTodaysDeals;
}
