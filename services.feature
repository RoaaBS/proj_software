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


Feature: Add service to a clinic
	Description:add an service to the clinic
	Actors: Admin

Scenario: Add a service successfully
 	Given that the administrator is logged in
 	And there is a service with name "Blood test" and price "15"
 	When the service is added to the clinic
 	Then the service with name "blood test" and price "15" is contained in the clinic
 	
Scenario: Add a service when the adminstrator is not logged in
	Given that the administrator is not logged in
 	And there is a service with name "Physical therapy" and price "100"
	When the service is added to the clinic
	Then the error message "Administrator login required" is given
	
