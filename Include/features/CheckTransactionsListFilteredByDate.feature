Feature: See my transactions with date filter
	As a user
	I want to filter my transactions by date
	So that I can analyze my transactions by date

Scenario: Filter listed transactions list
	Given the user has an open browser
	When the user navigates to site
	And the user has the transaction option chosen at panel
	And the user has some transactions
	And the user click on the date column at the transactions list
	Then the user sees a transactions list filtered by date
