@B30G16-196
Feature: Default

	Background:
		#@B30G16-187
		Given the user is on the login page

	@B30G16-190
	Scenario: US11AC1 Verify that Store  managers should see an "error message"
		Given the user logged in as "store manager"
		Then user is on "Dashboard" page
		And user chooses Vehicles Odometer from Fleet drop-down
		And user see an error message "You do not have permission to perform this action."

	@B30G16-198


	@B30G16-199
	Scenario: US11AC3 Divers should see the View Per Page is 25 by default
	Given the user logged in as "driver"
	Then user is on "Dashboard" page
	And user chooses Vehicles Odometer from Fleet drop-down
	Then the driver should see that the View Per Page option is set to "25"

	@B30G16-243
	Scenario:  US11AC1 Verify that Sales Managers should see an "error message"
	Given the user logged in as "sales manager"
	Then user is on "Dashboard" page
	And user chooses Vehicles Odometer from Fleet drop-down
	And user see an error message "You do not have permission to perform this action."