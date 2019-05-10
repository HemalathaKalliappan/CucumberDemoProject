Feature: Login Functionality Feature

@Chrome @Firefox
Scenario Outline: Verify Valid Login
Given User is in homepage
Then  Enter "<username>" and "<password>" and click on Submit
Then  login should be successful
Examples: 
	| username | password |
	|naveenautomation| test@123|
	|naveenautomation| test@123|
	|naveenautomation2| test@123|
	

Scenario Outline: Contact page fuctionality
Given User is in homepage
Then  Enter "<username>" and "<password>" and click on Submit
Then Verify the contact lable
Then Click on contact link
Then Click on Contact new page link
Then Enter the field values in contact page "<ftName>"and "<ltName>" and "<comp>" and Click on submit

Examples: 
	| username		 | password 		| ftName| ltName	|comp|
	|naveenautomation| test@123	|hema	|latha	|Hexacorp	|
	|naveenautomation| test@123	|hema	|latha	|Hexacorp	|
	|naveenautomation| test@123	|hema	|latha	|Hexacorp	|

@Regression	
Scenario Outline: Company page fuctionality
Given User is in homepage
Then  Enter username password and click on Submit
Then Verify the contact lable
Then Verify the contact link
Then Verify the Contact new page link
Then Verify the field values
Examples: 
	|naveenautomation| test@123|

@Regression
Scenario Outline: Deal page fuctionality
Given User is in homepage
Then  Enter "<username>" and "<password>" and click on Submit
Then Verify the Deal lable
Then Verify the Deal link
Then Verify the Deal new page link
Then Verify the Deal field values
Examples: 
	| username | password |
	|naveenautomation| test@123|
	
	
	