@B30G16-205
Feature: Managing filters

	Background:
		@B30G16-200
		Given user logs in as sales user
		@B30G16-201
		Given user logs in as store manager user

	@B30G16-203
	Scenario: Store and sales managers should see all 5 filter options are checked by default
		Given user is on marketing page
		When user clicks on 'Manage filters' button
		Then user should see all 5 filter options provided below
		|Name       |
		|Code       |
		|Start Date |
		|End Date   |  
		|Budget     |	

	@B30G16-204
	Scenario: Any amount of boxes should be unchecked
		Given user is on marketing page
		When user clicks on 'Manage filters' button
		And user clicks unchecks '2' boxes
		Then user should still see remaining filters