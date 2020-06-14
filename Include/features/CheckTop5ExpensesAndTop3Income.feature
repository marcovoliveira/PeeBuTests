Feature: See top5 expenses and top3 incomes
  As a user
  I want to see my top5 expenses and top3 incomes
  So that I can analyze my transactions

  Background: 
    Given the user has an open browser
    And the user navigates to site
    And the user has the settings option chosen at panel
    And the user change api url 'https://5ee0225c9ed06d001696db5d.mockapi.io/empty/categorised'
    And the user has the transaction option chosen at panel
    And the user refresh the transaction list

  Scenario: Check a list with top5 expenses and top3 incomes
    Given the user has the statistics option chosen at panel
    Then the user sees a list with top5 expenses and top3 incomes

  Scenario Outline: Check top tables have the biggest categorised value first
    Given the user has the statistics option chosen at panel
    Then the user sees the <value> at <position> of <table>

    Examples: 
      | value  | position | table        |
      | 371.86 |        0 | tableExpense |
      |  91.86 |        1 | tableExpense |
      |  61.86 |        2 | tableExpense |
      |  41.86 |        3 | tableExpense |
      |  21.86 |        4 | tableExpense |
      | 433.10 |        0 | tableIncome  |
      | 269.10 |        1 | tableIncome  |
      | 143.72 |        2 | tableIncome  |

