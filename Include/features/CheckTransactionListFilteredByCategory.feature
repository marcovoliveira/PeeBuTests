  Feature: See my transactions with category filter
	As a user
	I want to filter my transactions by category
	So that I can analyze my transactions by category
	
Background:
	Given the user has an open browser
	When the user navigates to site
	And the user has the transaction option chosen at panel
	And the user has some transactions
  Given a categorized list of transactions

Scenario: Filter listed transactions list
	When the user click on the category column at the transactions list
	Then the user sees a transactions list filtered by category
