

#Scenario Outline: Login Functionality

#Given User must be registered
#When Login using <username> and <password>
#Then User must be in home page

#Examples: 
#|username| |password|
#|laly1| |popins2|
#|raji34| |great56|

#Background: Browser Launch
#Given Browser must be installed by user
#When User enters AUT URL in browser
#Then Application must open inthe browser
#@Login
#Scenario: User Login
#Given user must be registered
#When User enters credentials and performs login
#Then User must be in the home page
#@Register
#Scenario: User Registration
#Given user must be logged in
#When User enters all the mandatory filed
#Then Registration done successfully
#@Login @Search 
#Scenario: Search
#Given User must be logged in and search field must be present
#When Search for a product
#Then Product details must be displayed

Feature: Login Functionality
Scenario: Login Functionality

Given User must be registered
When Login using below credentials
|username| |password|
|laly1| |popins2|
|raji34| |great56|

Then User must be in home page

