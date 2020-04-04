Feature: See transactions in a chart
	As a user
	I want to see transactions in a chart
	So that I can analyze my transactions

Scenario: Check a pie chart
	Given the user has an open browser
	When the user navigates to <site_name>
	And selects the more option <button_id>
	And the user has some transactions
	Then the user sees a pie chart <chart_id> with all his transactions
