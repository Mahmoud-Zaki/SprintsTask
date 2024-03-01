@Regression_TCs @Search_TCs
Feature: Search

  Background:
    Given Go to home page

  @Search_TC_01
  Scenario: Search using valid product name
    When Enter product name as "laptop"
    Then Verify that the results related to the product name is displayed

  @Search_TC_02
  Scenario: Search using invalid product name
    When Enter product name as "xyz1"
    Then Verify that the error message is displayed