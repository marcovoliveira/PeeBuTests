Feature: Check a panel at landing page
	As a user
	I want to navigate to NOME DO SITE
	So that I can see a landing page with a panel on which I can choose what I want to see

Scenario: Check if a panel exists at landing page
	Given the user has an open browser
	When the user navigates to site
	Then the user sees a panel at landing page
