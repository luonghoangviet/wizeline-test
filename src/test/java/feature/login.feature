Feature: Verify login function

  Scenario: Verify that user can login success with valid username and password
    Given I login to saucedemo page
    Then User should be redirected to the inventory page
