Feature: See my transactions with category filter
	As a user
	I want to filter my transactions by category
	So that I can analyze my transactions by category

Scenario: Filter listed transactions list
	Given the user has an open browser
	When the user navigates to <site_name>
	And the user has the transaction option chosen at panel
	And the user has some transactions
	And the user click on the date column <column_id> at the transactions list
	Then the user sees a transactions list filtered by date
