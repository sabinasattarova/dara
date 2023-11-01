@B30G16-210
Feature: Default

	Background:
		#@B30G16-187
		Given the user is on the login page

	@B30G16-182
	Scenario: US9AC1 Verify store manager views error messages for entering invalid integers.
		Given the user logged in as "store manager"
		    Then user is on "Dashboard" page
		    Then user clicks on Activities
		    Then user clicks on Calendar Events
		    Then user clicks on Create Calendar Event
		    Then user clicks on Repeat checkbox 
		    Then user enters integer less than -1
		    Then user views The value have not to be less than 1 error message
		    Then user enters integer more than 99
		    Then user views The value have not to be more than 99 error message	


	@B30G16-220
	Scenario: US9AC1 Verify sales manager views error messages for entering invalid integers.
		Given the user logged in as "sales manager"
		    Then user is on "Dashboard" page
		    Then user clicks on Activities
		    Then user clicks on Calendar Events
		    Then user clicks on Create Calendar Event
		    Then user clicks on Repeat checkbox 
		    Then user enters integer less than -1
		    Then user views The value have not to be less than 1 error message
		    Then user enters integer more than 99
		    Then user views The value have not to be more than 99 error message	


	@B30G16-221
	Scenario: US9AC1 Verify driver views error messages for entering invalid integers.
		Given the user logged in as "driver"
		    Then user is on "Dashboard" page
		    Then user clicks on Activities
		    Then user clicks on Calendar Events
		    Then user clicks on Create Calendar Event
		    Then user clicks on Repeat checkbox 
		    Then user enters integer less than -1
		    Then user views The value have not to be less than 1 error message
		    Then user enters integer more than 99
		    Then user views The value have not to be more than 99 error message