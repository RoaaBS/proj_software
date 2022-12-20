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
Feature: Delete appointment
the user wants to delete an appointment 

@tag1
 Scenario:  User is not logged in
Given The user wants to delete an appointment and he is not logged in
Then show "Please login"

@tag2
 Scenario:  User Choose Delete Appointment
Given The user wants to delete an appointment and he is logged in
Then delete this appointment and this appointment is available now