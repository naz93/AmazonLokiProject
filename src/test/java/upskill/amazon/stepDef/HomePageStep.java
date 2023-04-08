package upskill.amazon.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.HomePageAction;

public class HomePageStep {
	HomePageAction HomePageActionObj =new HomePageAction();
	
	
	@Given("^Open Amazon Homepage$")
	public void open_Amazon_Homepage() throws Throwable {
	    //wait
	}

	@When("^Select Whole Foods Market$")
	public void select_Whole_Foods_Market() throws Throwable {
		HomePageActionObj.selectWholeFoodsMarket();
	}

	@When("^Search for Plain bagles$")
	public void search_for_Plain_bagles() throws Throwable {
		HomePageActionObj.SearchBagels();
	}
	@When("^Select Amazon Fresh$")
	public void select_Amazon_Fresh() throws Throwable {
		HomePageActionObj.selectAmazonFresh();
	}
	@When("^Search for yogurt$")
	public void search_for_yogurt() throws Throwable {
		HomePageActionObj.SearchYogurt();
	}
	@When("^mouse hover to Account and lists$")
	public void mouse_hover_to_Account_and_lists() throws Throwable {
		HomePageActionObj.MouseHoverAccount();
	
	}

	@When("^click on Music Library$")
	public void click_on_Music_Library() throws Throwable {
		HomePageActionObj.clickMusicLibrary();

}
	@When("^click on todays deal$")
	public void click_on_todays_deal() throws Throwable {
		HomePageActionObj.clickTodaysDeals();
}
}
	
	

