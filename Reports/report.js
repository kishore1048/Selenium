$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Amazon.feature");
formatter.feature({
  "name": "To vaildate the Amazon account",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To login amazon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Kumar"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and max the window",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonLogin.toLaunchTheChromeBrowserAndMaxTheWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Launch the amazon url",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonLogin.toLaunchTheAmazonUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login page of amazon",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.toClickTheLoginPageOfAmazon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass mobile number in mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.toPassMobileNumberInMobileNumberField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To take the screen shot",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.to_take_the_screen_shot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonLogin.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
});