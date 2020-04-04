Feature: See a categorized transaction list
	As a user
	I want to see a categorized list of transactions
	So that I can more easily analyze transactions

Scenario: Check if transactions are categorized at the list
	Given the user has an open browser
	When the user navigates to <site_name>
	And the user has the transaction option chosen at panel <panel_id>
	And the user has some transactions
	Then the user sees a transactions list <list_id> with category icon <icon_id> at each transaction
