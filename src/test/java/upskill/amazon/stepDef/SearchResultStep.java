package upskill.amazon.stepDef;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.SearchResultAction;

public class SearchResultStep {
	
	SearchResultAction SearchResultActionObj = new SearchResultAction();
	
	@When("^click on map$")
	public void click_on_map() throws Throwable {
		SearchResultActionObj.clickMap();
	}

	@When("^put zip code$")
	public void put_zip_code() throws Throwable {
		SearchResultActionObj.putZip();
	}

	@When("^click apply$")
	public void click_apply() throws Throwable {
		SearchResultActionObj.clickApply();
	}

	@When("^click done$")
	public void click_done() throws Throwable {
		SearchResultActionObj.clickDone();
		
	}
	

@Then("^Item  list should have only bagel related products$")
public void item_list_should_have_only_bagel_related_products() throws Throwable {
		SearchResultActionObj.varifyBagelItems();
}
	
	

@Then("^Item  list should have only yogurt related products$")
public void item_list_should_have_only_yogurt_related_products() throws Throwable {
		SearchResultActionObj.varifyYogurtItems();
	
	}
	
	//@When("^Dropdown sort by avr\\.customer review$")
	//public void dropdown_sort_by_avr_customer_review() throws Throwable {
	//	SearchResultActionObj.selectAvgCustomerReviws();
		
	
	@Then("^Check box prime$")
	public void check_box_prime() throws Throwable {
		SearchResultActionObj.selectPrime();

	    
	}

		}
	
	    