Feature: Update an existing transaction
	As a user
	I want to update an existing transaction 
	So that I can keep my transactions updated

Scenario: Update an existing transaction
	Given the user has an open browser
	When the user navigates to <site_name>
	And has the transaction option chosen at panel <panel_id>
	And the user has some transactions
	And the user clicks on the transaction’s update option <button_id>
	And the user changes the data at the transaction form
	And the user clicks on save transaction option <button_id>
	Then the transaction is update at the transaction list
