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

  
##Background: the clinic has billings
##And these are the billings 
## |patient name |last name    |  service            |price(NIS)    | D.O.A     | time h:m |          
## |seema        |abusamra     |  Blood test         |15            |10/5/2022  | 20:00    |
## |ali          |dahdoh       |  urine test         |10            |15/5/2022  | 15:00    |
## |seema        |abusamra     |  x-ray test         |25            |30/5/2022  | 12:00    |
## |ali          |dahaoh       | roentgon x-ray test |35            |30/5/2022  | 23:00    |
 
 Feature: Add billing to a clinic
	Description:add an billing to the clinic
	Actors: Admin
	 
Scenario: add a billing successfully
 	Given that the administrator is logged in
 	And there is a billing with patient_name "seema" , last_name is "abusamra" , service is "blood test" , price is "15" , D_O_A is "10/5/2022" and time is "20:00"
 	When the billing is added in the clinic
 	Then the billing with patient_name "seema" , last_name is "abusamra" , service is "blood test" , price is "15" , D_O_A is "10/5/2022" and time is "20:00" is contained in the clinic
 	
Scenario: add a billing when the adminstrator is not logged in
	Given that the administrator is not logged in
 	And there is a billing with patient_name "zaina" , last_name is "abusamra" , service is "urine test" , price is "15" , D_O_A is "11/5/2022" and time is "22:00"
	When the billing is added in the clinic
	Then the error message "Administrator login required" is given
	
	