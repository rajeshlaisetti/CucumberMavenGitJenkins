$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ApplicationLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login into application by using valid credentials",
  "description": "",
  "id": "login-into-application-by-using-valid-credentials",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2932307406,
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
  "duration": 12623339438,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.launch_the_application()"
});
formatter.result({
  "duration": 55714,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.enter_the_valid_user_name_and_password()"
});
formatter.result({
  "duration": 1059210392,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d63.0.3239.108)\n  (Driver info: chromedriver\u003d2.34.522940 (1a76f96f66e3ca7b8e57d503b4dd3bccfba87af1),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027DESKTOP-IASOHB8\u0027, ip: \u0027172.16.4.88\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.34.522940 (1a76f96f66e3ca..., userDataDir: C:\\Users\\Nisum\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 63.0.3239.108, webStorageEnabled: true}\nSession ID: 65f353a896fc0a51770e5b5f745c7cad\n*** Element info: {Using\u003dxpath, value\u003d.//div[@id\u003d\u0027tinycontent\u0027]//a[@id\u003d\"closeButton\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.macys.StepDefination.enter_the_valid_user_name_and_password(StepDefination.java:46)\r\n\tat ✽.And Enter the valid user name and password(ApplicationLogin.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination.user_is_able_to_log_into_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 596658319,
  "status": "passed"
});
});