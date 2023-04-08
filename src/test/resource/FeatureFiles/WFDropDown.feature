@regression @smoke @us-248
Feature: Amazon Whole Foods and Fresh Functionality

Description: User should able to find WF and Fresh on Amazon website

	
	
	Scenario: WF Functionality
		Given Select Whole Foods Market
		When  Search for Plain bagles
		And   click on map
		And   put zip code
		And   click apply
		And  click done
		Then Item  list should have only bagel related products
		
		
		Scenario: Fresh Functionality
		Given Select Amazon Fresh
		When Search for yogurt
		And Item  list should have only yogurt related products
