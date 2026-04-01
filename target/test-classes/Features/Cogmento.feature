Feature:Add contact in Cogmento application
  Background:
    Given I am on Cogmento login page
    When I enter username and password
    And Click on login button

Scenario:Verify contact is added
Given Cogmento Home screen is displayed
When I Navigate to Contact Tab
And Click on Create contact button
And Enter Contact details
And click on save buuton
Then Verify the newly created contact
