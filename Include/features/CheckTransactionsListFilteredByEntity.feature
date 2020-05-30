Feature: See my transactions with entity filter
	As a user
	I want to filter my transactions by entity
	So that I can analyze my transactions by entity

Scenario: Filter listed transactions list
	Given the user has an open browser
	When the user navigates to site
	And the user has the transaction option chosen at panel
	And the user has some transactions
	And the user click on the entity column at the transactions list
	Then the user sees a transactions list filtered by entity
