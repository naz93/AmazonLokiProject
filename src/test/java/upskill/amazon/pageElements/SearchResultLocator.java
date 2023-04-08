package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultLocator {
	
	@FindBy(xpath = "//div[@id='nav-packard-glow-loc-icon']")
	public WebElement clickMap;
	
	@FindBy(xpath = "//input[@id='GLUXZipUpdateInput']")
	public WebElement txtZip;
	
	@FindBy(xpath = "//input[@aria-labelledby='GLUXZipUpdate-announce']")
	public WebElement clickApply;
	
	@FindBy(xpath = "//span[@data-action='a-popover-close']")
	public WebElement clickDone;
	
	//validate bagel
	@FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
	public WebElement txtBagel;
	
	//validate Yogurt
	@FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
	public WebElement txtYogurt;
	
	
	@FindBy(xpath = "//i[@aria-label='Prime eligible']")
	public WebElement cbxPrime;
	
}
