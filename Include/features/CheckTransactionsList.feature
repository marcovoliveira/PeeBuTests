Feature: See a transactions list
	As a user
	I want to see a transactions list
	So that I can verify all my transactions

Scenario: Check if a transactions list exists
	Given the user has an open browser
	When the user navigates to site
	And the user has the transaction option chosen at panel
	And the user has some transactions
	Then the user sees a transactions list 

Scenario: Transaction list is empty
	Given the user has an open browser
	When the user navigates to site
	And the user has the settings option chosen at panel
	And the user change api url
	And the user has the transaction option chosen at panel
	And the user refresh the transaction list
	Then the user sees an empty transactions list
	
