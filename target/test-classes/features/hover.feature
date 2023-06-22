#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Flipkart header Hover

Scenario: Hover on Flipkart Fashion option and get a list

Given user is already on Home Page
When title of login page is "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
Then user close login pop up
Then user hover on fashion
Then user get fashion list
Then user quit

Scenario: Hover on Flipkart Electronics option and get a list

Given user is already on Home Page
When title of login page is "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
Then user close login pop up
Then user hover on electronics
Then user get electronics list
Then user quit

Scenario: Hover on Flipkart Furniture option and get a list

Given user is already on Home Page
When title of login page is "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
Then user close login pop up
Then user hover on Furniture
Then user get Furniture list
Then user quit
Scenario: Hover on Flipkart toys,beauty and others option and get a list

Given user is already on Home Page
When title of login page is "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
Then user close login pop up
Then user hover on toys,beauty and others
Then user get toys,beauty and others list
Then user quit


Scenario: Hover on Flipkart motorBike option and get a list

Given user is already on Home Page
When title of login page is "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
Then user close login pop up
Then user hover on motorBike
Then user get motorBike list
Then user quit