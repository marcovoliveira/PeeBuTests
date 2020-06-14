Feature: See expesenses chart by category
  As a user
  I want to see my expenses on a chart grouped by categories
  So that I can analyze expenses on diferent categories

  Background: 
    Given the user has an open browser
    And the user navigates to site
    And the user has the settings option chosen at panel
    And the user change api url 'https://5ee0225c9ed06d001696db5d.mockapi.io/empty/categorised'
    And the user has the transaction option chosen at panel
    And the user refresh the transaction list

  Scenario: Check the expense pie chart with categories
    Given the user has the statistics option chosen at panel
    Then the user sees a pie chart

  Scenario Outline: Check expense pie chart have the correct values
    Given the user has the statistics option chosen at panel
    Then the user sees the <value> at <category>

    Examples: 
      | value | category    |
      |   7.1 | "Food"      |
      |  19.3 | "Education" |
      |  73.6 | "HouseHold" |
