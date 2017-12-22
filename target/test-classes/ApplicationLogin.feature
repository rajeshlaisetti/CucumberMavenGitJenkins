Feature: Login into application by using valid credentials

@Login
Scenario: veify whether the user is able to log into application or not

Given appplicaiton url and valid user name and password
When Launch the application
And Enter the valid user name and password
Then user is able to log into the application

