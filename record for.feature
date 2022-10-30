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
Feature: record for all patient/customer
each patient should have a record in the system .
Background:
     | Name    | ID    | Age | Gender |  D.O.A          |Final Diagnosis  |General Doctor        |phone number   |company number|
  |  seema     | 123   | 7   | female |  02/10/2022  |  cough           | dima awda           |0595676812     |0595676822    |
   |  ali         | 456   | 10  | male   |  07/10/2022  |  vomiting        | mohammad abusamra   |0595676813     |0595676823    |
 |  mila        | 789   | 5   | female |  18/10/2022  |  Sore throat     |hatim asusa          |0595676814     |0595676824    |
  
  


  
 Scenario: register patient  when the admin is logged in 
	Given that the admin is logged in 
	And ther is a patient with id "123" , name "seema",gender "female", ,age "7",phone number "0595676812",D.O.A  "02/10/2022",Final Diagnosis "cough ",General Doctor "dima awda",company number "0595676822"
	When the patient with id "123" register 
	Then the user  with id "123" , name "seema",phone number "0595676812",gender"female", ,age "7",D.O.A " 02/10/2022",Final Diagnosis"cough ",General Doctor"dima awda" is registered in the system
	
	
    Scenario: register patient when the admin is not logged in 
	Given that the admin is not logged in 
	And ther is a patient with  id "456" , name "ali",gender "male", ,age "10",phone number "0595676813",D.O.A  "07/10/2022 ",Final Diagnosis "vomiting  ",General Doctor "mohammad abusamra",company number "0595676823"
	When the patient with id "456" register 
	Then error message "Administrator login required" is given
	
	Scenario: register patient when the admin is logged in                                                          
  Given that the admin is logged in and the patient is already registered
  And ther is a patient withid "123" , name "seema",gender "female", ,age "7",phone number "0595676812",D.O.A  " 02/10/2022",Final Diagnosis "cough ",General Doctor "dima awda",company number "0595676824"
  When the patient with id "3" register
  Then error message "This patient is already registered" is given
	

	

	

	
  

  
