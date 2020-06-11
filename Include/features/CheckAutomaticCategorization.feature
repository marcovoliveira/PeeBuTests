Feature: Categorize same entity transactions automatically
				As a user
				I want to categorize automatically same entity transactions
				So that I can categorize all list with less effort 

Background: 
			Given the user has an open browser
			When the user navigates to site
			And the user has the settings option chosen at panel
			And the user change api url 'https://5ee0225c9ed06d001696db5d.mockapi.io/empty/results'
			And the user has the transaction option chosen at panel
			And the user refresh the transaction list
				
Scenario: Categorize all transactions from the same entity 
				When the user activate automatic categorization
				And the user clicks to choose a category of a transaction
				And the user selects a category at a categories selection
				Then all transactions from the same entity are categorized

