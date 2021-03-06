Feature: Categorize a transaction
				As a user
				I want to categorize any transaction
				So that I can keep the correct track of my transactions
				
Scenario: Categorize a transaction
				Given the user has an open browser
				When the user navigates to site
				And the user has the transaction option chosen at panel
				And the user has some transactions
				And the user clicks to choose a category of a transaction
				And the user selects a category at a categories selection
				Then the transaction is categorized