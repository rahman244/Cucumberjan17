$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "SearchBox Action",
  "description": "",
  "id": "searchbox-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful search with Valid Credentials",
  "description": "",
  "id": "searchbox-action;successful-search-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters UserName and Password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 286740286,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 41336,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 30996,
  "status": "passed"
});
});