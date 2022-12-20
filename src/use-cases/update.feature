Feature: Update appointment 
the user wants to update an appointment 

@tag1
 Scenario: user out 
Given The user needed change an appointment and he is logout
Then   update failed

@tag2
Scenario: user in system
Given The user  need update an appointment and he is in system
Then update done