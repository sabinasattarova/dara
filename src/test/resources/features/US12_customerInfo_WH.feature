@B30G16-197
Feature: US12- As a user, I want to filter customers’ info on the Account page.

	Background:
		#@B30G16-187
		Given the user is on the login page

	@B30G16-183
	Scenario: US12AC1 Verify Store Manager should see 8 filter items on the Accounts page 
		Given the user logged in as "store manager"
		    Then user is on "Dashboard" page
		    And   user clicks on the Customers
		    Then user clicks on the Accounts
		    Then user clicks filter button
		    Then user sees eight filter items
		     | Account name  |
		     | Contact name  |
		     | Contact email |
		     | Contact phone |
		     | Owner         |
		     | Business Unit |
		     | Created At    |
		     | Updated At    |	


	@B30G16-215
	Scenario: US12AC1 Verify Sales Manager should see 8 filter items on the Accounts page 
		Given the user logged in as "sales manager"
		    Then user is on "Dashboard" page
		    And   user clicks on the Customers
		    Then user clicks on the Accounts
		    Then user clicks filter button
		    Then user sees eight filter items
		     | Account name  |
		     | Contact name  |
		     | Contact email |
		     | Contact phone |
		     | Owner         |
		     | Business Unit |
		     | Created At    |
		     | Updated At    |