Feature: Verify login function

  Scenario: Verify that user can login success with valid username and password
    Given I login to saucedemo page
    Then I should be redirected to the inventory page
