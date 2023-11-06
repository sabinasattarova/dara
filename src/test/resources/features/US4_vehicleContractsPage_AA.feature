@B30G16-227
Feature: US4- As a user, I want to access to Vehicle contracts page

	Background:
		#@B30G16-187
		Given the user is on the login page
		

	@B30G16-225
	Scenario: US4AC1 Verify store managers access the Vehicle contracts page
		Given the user logged in as "store manager"
		Then user is on "Dashboard" page
		And user chooses "Vehicle Contracts" from Fleet drop-down
		Then verify Expected URL: "https://qa.fleetapps.io/entity/Extend_Entity_VehicleContract"
		Then verify Expected title: "All - Vehicle Contract - Entities - System - Car - Entities - System"	


	@B30G16-226
	Scenario: US4AC2 Verify drivers should not be able to access the Vehicle contracts page
		Given the user logged in as "driver"
		Then user is on "Dashboard" page
		And user chooses "Vehicle Contracts" from Fleet drop-down
		Then verify "You do not have permission to perform this action." error message is displayed	



	@B30G16-228
	Scenario: US4AC1 Verify sales managers access the Vehicle contracts page
		Given the user logged in as "sales manager"
		Then user is on "Dashboard" page
		And user chooses "Vehicle Contracts" from Fleet drop-down
		Then verify Expected URL: "https://qa.fleetapps.io/entity/Extend_Entity_VehicleContract"
		Then verify Expected title: "All - Vehicle Contract - Entities - System - Car - Entities - System"