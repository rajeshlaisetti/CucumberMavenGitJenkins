$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ApplicationLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login into application by using valid credentials",
  "description": "",
  "id": "login-into-application-by-using-valid-credentials",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2613646349,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "veify whether the user is able to log into application or not",
  "description": "",
  "id": "login-into-application-by-using-valid-credentials;veify-whether-the-user-is-able-to-log-into-application-or-not",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "appplicaiton url and valid user name and password",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Launch the application",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid user name and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is able to log into the application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.appplicaiton_url_and_valid_user_name_and_password()"
});
formatter.result({
  "duration": 15481646285,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.launch_the_application()"
});
formatter.result({
  "duration": 54655,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.enter_the_valid_user_name_and_password()"
});
formatter.result({
  "duration": 1532138925,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_is_able_to_log_into_the_application()"
});
formatter.result({
  "duration": 1747420783,
  "status": "passed"
});
formatter.after({
  "duration": 234843,
  "status": "passed"
});
});