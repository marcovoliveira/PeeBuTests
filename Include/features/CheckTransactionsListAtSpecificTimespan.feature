Feature: See transactions list at a specific timespan
	As a user
	I want to define a timespan of my transactions
	So that I can see all my transactions at the defined timespan

Scenario: Define listed transactions timespan
	Given the user has an open browser
	When the user navigates to <site_name>
	And The user has the transaction option chosen at panel <panel_id>
	And The user has some transactions
	And The user defines the from date
	And The user defines the to date
	Then The user sees a transactions list at a defined timespan
