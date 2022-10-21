
   
Feature: Login
Background:
|roaa.sabbarini@gmail.com|123|
|zaina@gmail.com|456|
|aya@gmail.com|789|

  
  Scenario: The Login process has been completed Successfull
    Given The user is not logged in
    And the password is "123"
    And the email is "roaa.sabbarini@gmail.com"
   	Then the user login succeeds
	And the user is logged in
	
   
  
   Scenario: user have wrong email
    Given The user is not logged in
    And the email is "roaasabbarini@gmail.com" 
    Then the user login fails
    And thw user is not logged in
    
    
    Scenario: user have wrong password
    Given The user is not logged in
    And the password is "1234"
    Then the user login fails
    And thw user is not logged in
    
     
   