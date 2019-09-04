$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features99/File1.feature");
formatter.feature({
  "name": "BDC validation on demowebshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registered user access track the ordered item in Demowebshop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user has already palced an order for his favorite item",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user tries to access the order tracking dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "BDC_DEMO__01_DEFINITIONS.user_tries_to_access_the_order_tracking_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "identifies the state of the order",
  "keyword": "Then "
});
formatter.match({
  "location": "BDC_DEMO__01_DEFINITIONS.identifies_the_state_of_the_order()"
});
formatter.result({
  "status": "skipped"
});
});