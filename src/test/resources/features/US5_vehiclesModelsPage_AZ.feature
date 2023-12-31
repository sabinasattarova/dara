@B30G16-211
Feature: Default

	Background:
		#@B30G16-187
		Given the user is on the login page
		
	@B30G16-188
	Scenario: US5AC1 Verify store managers see 10 columns on the Vehicle Model page
		Given the user logged in as "store manager"
		Then user is on "Dashboard" page
		And "store manager" chooses "Vehicles Model" from Fleet drop-down
		Then verify user sees the following columns
			| MODEL NAME               |
			| MAKE                     |
			| CAN BE REQUESTED         |
			| CVVI                     |
			| CO2 FEE (/MONTH)         |
			| COST (DEPRECIATED)       |
			| TOTAL COST (DEPRECIATED) |
			| CO2 EMISSIONS            |
			| FUEL TYPE                |
			| VENDORS                  |

	@B30G16-214
	Scenario: US5AC1 Verify sales managers see 10 columns on the Vehicle Model page
		Given the user logged in as "sales manager"
		Then user is on "Dashboard" page
		And "sales manager" chooses "Vehicles Model" from Fleet drop-down
		Then verify user sees the following columns
			| MODEL NAME               |
			| MAKE                     |
			| CAN BE REQUESTED         |
			| CVVI                     |
			| CO2 FEE (/MONTH)         |
			| COST (DEPRECIATED)       |
			| TOTAL COST (DEPRECIATED) |
			| CO2 EMISSIONS            |
			| FUEL TYPE                |
			| VENDORS                  |

	@B30G16-189
	Scenario: US5AC2 Verify drivers are not able to access the Vehicle Model page
		Given the user logged in as "driver"
		Then user is on "Dashboard" page
		And user chooses "Vehicles Model" from Fleet drop-down as a driver
		Then user sees error msg "You do not have permission to perform this action."