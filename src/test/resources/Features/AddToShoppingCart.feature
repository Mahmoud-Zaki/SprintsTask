@Regression_TCs @AddToShoppingCart_TCs
Feature: Add to shopping cart

  Background:
    Given Go to home page
    And Enter product name as "laptop"
    And Go to product page

  @AddToShoppingCart_TC_01
  Scenario: Add product to shopping cart from the product page

    When Add the product to shopping cart from the product page
    And Go to shopping cart
    Then Verify that product added in the shopping cart