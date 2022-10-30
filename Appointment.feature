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
@tag
Feature: Add Appointment for patients
Background:
| day | week | month  |
 |   2 | 1    | octobar |
| 10  |  2    | november    |



 Scenario: Add an appointment successfully
 	Given that the administrator is logged in
 	And there is a patient with id "123"
 	When the appointment is added to system
 	Then the patient with id "123", name "seema", gender"female", ,age "7",phone number "0595676812",D.O.A " 02/10/2022",Final Diagnosis"cough ",General Doctor"dima awda" is contained in the system
 	
	
Scenario: Add aappointment  when the adminstrator is not logged in
	Given that the administrator is not logged in
 	And there is a patient with id  "123"
	When the appointment  is added to the system
	Then the error message "Administrator login required" is given
	
	
	Scenario: Add aappointment with booked date 
	Given that the administrator is logged in
 	And there is a patient with id "123", name "seema", gender"female", ,age "7",phone number "0595676812",D.O.A " 02/10/2022",Final Diagnosis"cough ",General Doctor"dima awda"
	When the appointment  is"10/11/2022" 
	Then the error message "Appointment booked" is given
	
  

  

   
     
