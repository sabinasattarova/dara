@B30G16-216
Feature: Default

	Background:
		#@B30G16-187
		Given the user is on the login page
		

	@B30G16-206
	Scenario: US7AC1 Verify once the sales manager launch on the Vehicle page, all the checkboxes should be unchecked.
		Given the user logged in as "sales manager"
		    Then user is on "Dashboard" page
		    And user chooses "Vehicles" page from Fleet drop-down
		    Then user should see all the checkboxes are unchecked	


	@B30G16-207
	Scenario: US7AC2 Verify sales manager checks the first checkbox to check all the cars
		Given the user logged in as "sales manager"
		    Then user is on "Dashboard" page
		    And user chooses "Vehicles" page from Fleet drop-down
		    Then user checks the first checkbox
		    Then user should see all the checkboxes are checked	


	@B30G16-208
	Scenario: US7AC3 Verify sales manager can select any car
		Given the user logged in as "sales manager"
		    Then user is on "Dashboard" page
		    And user chooses "Vehicles" page from Fleet drop-down
		    Then user should be able to select any car	


	@B30G16-240
	Scenario: US7AC1 Verify once the store manager launch on the Vehicle page, all the checkboxes should be unchecked.
		Given the user logged in as "store manager"
		    Then user is on "Dashboard" page
		    And user chooses "Vehicles" page from Fleet drop-down
		    Then user should see all the checkboxes are unchecked	


	@B30G16-241
	Scenario: US7AC2 Verify store manager checks the first checkbox to check all the cars
		Given the user logged in as "store manager"
		    Then user is on "Dashboard" page
		    And user chooses "Vehicles" page from Fleet drop-down
		    Then user checks the first checkbox
		    Then user should see all the checkboxes are checked	


	@B30G16-242
	Scenario: US7AC3 Verify store manager can select any car
		Given the user logged in as "store manager"
		    Then user is on "Dashboard" page
		    And user chooses "Vehicles" page from Fleet drop-down
		    Then user should be able to select any car