Feature: Login Functionality Feature

Scenario Outline: Verify Valid Login
Given User is in homepage
Then  Enter "<username>" and "<password>" and click on Submit
Then  login should be successful
Examples: 
	| username | password |
	|naveenautomation| test@123|


Scenario Outline: Contact page fuctionality
Given User is in homepage
Then  Enter "<username>" and "<password>" and click on Submit
Then Verify the contact lable
Then Click on contact link
Then Click on Contact new page link
Then Enter the field values in contact page "<ftName>"and "<ltName>" and "<comp>" and Click on submit

Examples: 
	| username | password 		| ftName| ltName|comp|
	|naveenautomation| test@123	|hema	|latha	|Hexacorp|
