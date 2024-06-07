@tag
Feature: Login to Website
Background:
Given I landed on Academy website
@Regression
Scenario Outline: Login to a given Website
	Given the website of academy
	When user is entering username <username> and password <password>
	Then user is able to view the academy content
	
	Examples:
	| username         | password    |
	| nilroy@gmail.com |Nilanjana@29 | 
	
	