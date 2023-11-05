Feature: Default

	Background:
		#@B30G16-187
		Given the user is on the login page

	@B30G16-232
	Scenario: US8AC1 Verify store manager sees number 1 by default in the Repeat Every input
		Given the user logged in as "store manager"
		Then user is on "Dashboard" page
		Then "store manager" clicks on Activities
		Then user clicks on Create Calendar Event
		Then user clicks on Repeat checkbox
		And user sees 1 by default in the Repeat Every input

	@B30G16-250
	Scenario: US8AC1 Verify sales manager sees number 1 by default in the Repeat Every input
		Given the user logged in as "sales manager"
		Then user is on "Dashboard" page
		Then "store manager" clicks on Activities
		Then user clicks on Create Calendar Event
		Then user clicks on Repeat checkbox
		And user sees 1 by default in the Repeat Every input

	@B30G16-251
	Scenario: US8AC1 Verify driver sees number 1 by default in the Repeat Every input
		Given the user logged in as "driver"
		Then user is on "Dashboard" page
		Then "store manager" clicks on Activities
		Then user clicks on Create Calendar Event
		Then user clicks on Repeat checkbox
		And user sees 1 by default in the Repeat Every input

	@B30G16-252
	Scenario: US8AC2 Verify store manager sees an error message when the Calendar event repeat field is cleared
		Given the user logged in as "store manager"
		Then user is on "Dashboard" page
		Then "store manager" clicks on Activities
		Then user clicks on Create Calendar Event
		Then user clicks on Repeat checkbox
		Then user clears event repeat field
		Then user sees an error message This value should not be blank.

	@B30G16-253
	Scenario: US8AC2 Verify sales manager sees an error message when the Calendar event repeat field is cleared
		Given the user logged in as "sales manager"
		Then user is on "Dashboard" page
		Then "store manager" clicks on Activities
		Then user clicks on Create Calendar Event
		Then user clicks on Repeat checkbox
		Then user clears event repeat field
		Then user sees an error message This value should not be blank.

	@B30G16-254
	Scenario: US8AC2 Verify driver sees an error message when the Calendar event repeat field is cleared
		Given the user logged in as "driver"
		Then user is on "Dashboard" page
		Then "store manager" clicks on Activities
		Then user clicks on Create Calendar Event
		Then user clicks on Repeat checkbox
		Then user clears event repeat field
		Then user sees an error message This value should not be blank.