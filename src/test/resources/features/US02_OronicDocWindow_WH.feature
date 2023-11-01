@B30G16-237
Feature: Default

	Background:
		#@B30G16-187
		Given the user is on the login page

	@B30G16-235
	Scenario: US2AC1 Verify Sales Manager access Oroinc Documentation Page
		Given the user logged in as "sales manager"
		Then user is on "Dashboard" page
		Then user clicks on the Question mark
		And user is on the OroDocs Window Page 
		Then user verifies link "https://doc.oroinc.com/"	

	@B30G16-236
	Scenario: US2AC1 Verify Store Manager access Oroinc Documentation Page
		Given the user logged in as "store manager"
		Then user is on "Dashboard" page
		Then user clicks on the Question mark
		And user is on the OroDocs Window Page 
		Then user verifies link "https://doc.oroinc.com/"	

	@B30G16-238
	Scenario: US2AC1 Verify Driver access Oroinc Documentation Page
		Given the user logged in as "driver"
		Then user is on "Dashboard" page
		Then user clicks on the Question mark
		And user is on the OroDocs Window Page 
		Then user verifies link "https://doc.oroinc.com/"