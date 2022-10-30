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
Feature: report
	Description:create a report to the clinic
	Actors: Admin
  Background: the clinic has reports
 And these are the data
  
  ##  |  number of              | the number | percentage of increase|
  ##  |  blood test             |     160    |           13%         | 
   ## |  urine test             |     75     |           16%         |
   ## |  x-ray                  |     30     |           12%         |
   ## | roentgon x-ray          |     15     |           15%         |
   ## | visits to new patients  |     90     |           20%         |
  ## | visits to old patients  |     10     |           0%          |
   ## | non-emergency cases     |     30     |           5%          |
  ##  | emergency cases         |     60     |           10%         |
   ## | blood donation          |     5      |           -3%         |
   ## | income from patients    |     3300   |           10%         |
   ## | income from others      |     15000  |           15%         |
 
  @regression @smoke
Scenario: create a report successfully
 	Given the admin is logged in
 	And there is a report with name "Blood test" , number "160" and percentage of increase "13%"
 	When the report is created to the clinic
 	Then the report with name "Blood test" , number "160" and percentage of increase "13%" is contained in the clinic
 	
Scenario: create a report when the adminstrator is not logged in
	Given  the admin is not logged in
 	And there is a report with name "Blood test" , number "160" and percentage of increase "13%"
	When the report is created to the clinic
	Then the error message "Administrator login required" is given
	