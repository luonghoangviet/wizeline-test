Feature: Verify inventory(product) page
  Background:
    Given I login to saucedemo page

  Scenario: Verify that user can select product with the title containing T-shirt
    When I select item contains "T-Shirt" title
    Then I should be redirected to the item page

  Scenario: Verify that user can see product with the title containing T-shirt
    When I select item contains "T-Shirt" title
    Then I should be redirected to the item page
    And I should see item contains "T-Shirt" in title
    When I click add to cart button on the item page