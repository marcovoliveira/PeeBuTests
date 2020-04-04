Feature: See top5 expenses and top3 incomes
	As a user
	I want to see my top 5 expenses and top3 incomes
	So that I can analyze my transactions

Scenario: Check a list with top5 expenses and top3 incomes
	Given the user has an open browser
	When the user navigates to <site_name>
	And selects the more option <button_id>
	And the user has some transactions
	Then the user sees a list with top5 expenses and top3 incomes
