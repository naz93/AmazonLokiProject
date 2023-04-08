@regression @smoke @SKYW-15 @E2E
Feature: Amazon today's deal and music

 
Scenario: Aamzon Today's Deal
		Given Open Amazon Homepage
		When  click on todays deal
		Then Check box prime
		
	Scenario: Amazon Music Mousehover
		Given Open Amazon Homepage
		When  mouse hover to Account and lists
		Then  click on Music Library
		
		