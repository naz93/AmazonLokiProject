$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PertStoreApi.feature");
formatter.feature({
  "line": 2,
  "name": "Petstore API Testing",
  "description": "",
  "id": "petstore-api-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 4789389400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Pet CRUD API",
  "description": "",
  "id": "petstore-api-testing;pet-crud-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Create pet",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Get pet",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Update pet",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Delete pet",
  "keyword": "And "
});
formatter.match({
  "location": "PetstoreStepDef.create_pet()"
});
formatter.result({
  "duration": 2668542800,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreStepDef.get_pet()"
});
formatter.result({
  "duration": 24800,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreStepDef.update_pet()"
});
formatter.result({
  "duration": 21100,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreStepDef.delete_pet()"
});
formatter.result({
  "duration": 21800,
  "status": "passed"
});
formatter.after({
  "duration": 782566800,
  "status": "passed"
});
formatter.uri("WFDropDown.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon Whole Foods and Fresh Functionality",
  "description": "\r\nDescription: User should able to find WF and Fresh on Amazon website",
  "id": "amazon-whole-foods-and-fresh-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@us-248"
    }
  ]
});
formatter.before({
  "duration": 3540578800,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "WF Functionality",
  "description": "",
  "id": "amazon-whole-foods-and-fresh-functionality;wf-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Select Whole Foods Market",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Search for Plain bagles",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on map",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "put zip code",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click apply",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click done",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Item  list should have only bagel related products",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.select_Whole_Foods_Market()"
});
formatter.result({
  "duration": 1412132100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.search_for_Plain_bagles()"
});
formatter.result({
  "duration": 1706364700,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStep.click_on_map()"
});
formatter.result({
  "duration": 2150005000,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStep.put_zip_code()"
});
formatter.result({
  "duration": 142952800,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStep.click_apply()"
});
formatter.result({
  "duration": 82967400,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStep.click_done()"
});
formatter.result({
  "duration": 2109744100,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStep.item_list_should_have_only_bagel_related_products()"
});
formatter.result({
  "duration": 2040482000,
  "status": "passed"
});
formatter.after({
  "duration": 770647800,
  "status": "passed"
});
formatter.before({
  "duration": 2466078300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Fresh Functionality",
  "description": "",
  "id": "amazon-whole-foods-and-fresh-functionality;fresh-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Select Amazon Fresh",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Search for yogurt",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Item  list should have only yogurt related products",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.select_Amazon_Fresh()"
});
formatter.result({
  "duration": 1752115800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.search_for_yogurt()"
});
formatter.result({
  "duration": 1442632600,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStep.item_list_should_have_only_yogurt_related_products()"
});
formatter.result({
  "duration": 2060267100,
  "status": "passed"
});
formatter.after({
  "duration": 787166500,
  "status": "passed"
});
formatter.uri("todaysDeals.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon today\u0027s deal and music",
  "description": "",
  "id": "amazon-today\u0027s-deal-and-music",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@SKYW-15"
    },
    {
      "line": 1,
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "duration": 3314273700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Aamzon Today\u0027s Deal",
  "description": "",
  "id": "amazon-today\u0027s-deal-and-music;aamzon-today\u0027s-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open Amazon Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on todays deal",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Check box prime",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.open_Amazon_Homepage()"
});
formatter.result({
  "duration": 298600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.click_on_todays_deal()"
});
formatter.result({
  "duration": 4063194400,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStep.check_box_prime()"
});
formatter.result({
  "duration": 2252258600,
  "status": "passed"
});
formatter.after({
  "duration": 810376600,
  "status": "passed"
});
formatter.before({
  "duration": 2546288100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Amazon Music Mousehover",
  "description": "",
  "id": "amazon-today\u0027s-deal-and-music;amazon-music-mousehover",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Open Amazon Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "mouse hover to Account and lists",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click on Music Library",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.open_Amazon_Homepage()"
});
formatter.result({
  "duration": 232400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.mouse_hover_to_Account_and_lists()"
});
formatter.result({
  "duration": 2647625200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.click_on_Music_Library()"
});
formatter.result({
  "duration": 2758476400,
  "status": "passed"
});
formatter.after({
  "duration": 758256000,
  "status": "passed"
});
});