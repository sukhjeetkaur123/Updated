
Feature: chechking login functionality of application


 Scenario: chech the login functionality with valid credentails
 
 
  Given user is on login page
  Then user enter the username into username field
  Then user enter the password into password field
  Then user click on login button
  Then user is on home page
 