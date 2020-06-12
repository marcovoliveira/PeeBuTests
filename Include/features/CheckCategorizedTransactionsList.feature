Feature: See a categorized transaction list
	As a user
	I want to see a categorized list of transactions
	So that I can more easily analyze transactions

Background: 
		Given the user has an open browser
		When the user navigates to site

Scenario: Check table if categorized transactions don't exist
	When the user has the statistics option chosen at panel
	Then the user sees a empty transactions list

Scenario: Check table if categorized transactions exist
	When the user has the transaction option chosen at panel
	And the user has some transactions
	And the user clicks to choose a category of a transaction
	And the user selects a category at a categories selection
	And the user has the statistics option chosen at panel
	Then the user sees a transactions list with 1 entry
	
	