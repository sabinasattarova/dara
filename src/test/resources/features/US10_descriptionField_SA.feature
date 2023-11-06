Feature: US10- As a user, I want to write the “Description” when I create a calendar event. (Iframe).

	Background:
		#@B30G16-187
		Given the user is on the login page

	@B30G16-234
	Scenario: US10AC1 Verify user can write messages in the Description field on the calendar event page
		Given the user logged in as "store manager"
		Then user is on "Dashboard" page
		Then "store manager" clicks on Activities
		Then user clicks on Create Calendar Event
		Then user clicks on the description area
		And  user inputs a "message" in the description area

	@B30G16-255
	Scenario: US10AC1 Verify sales manager can write messages in the Description field on the calendar event page
		Given the user logged in as "sales manager"
		Then user is on "Dashboard" page
		Then "sales manager" clicks on Activities
		Then user clicks on Create Calendar Event
		Then user clicks on the description area
		And  user inputs a "message" in the description area

	@B30G16-256
	Scenario: US10AC1 Verify driver can write messages in the Description field on the calendar event page
		Given the user logged in as "driver"
		Then user is on "Dashboard" page
		Then "driver" clicks on Activities
		Then user clicks on Create Calendar Event
		Then user clicks on the description area
		And  user inputs a "message" in the description area

