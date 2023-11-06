@B30G16-186
Feature: US3- As a user, I want to learn how to use the pinbar.

	Background:
		#@B30G16-187
		Given the user is on the login page
		

	
	@B30G16-248
	Scenario:  US3AC1  verify store manger click the Learn how to use this space 
		Given the user logged in as "store manager"
		Then user is on "Dashboard" page
		When the user clicks the Learn how to use this space link
		Then the page should display the text "How To Use Pinbar"
		And the page should contain the instruction "Use pin icon on the right top corner of page to create fast access link in the pinbar."	

	@B30G16-244
	Scenario:  US3AC1  verify Sales manger  click the Learn how to use this space 
		Given the user logged in as "sales manager"
		Then user is on "Dashboard" page
		When the user clicks the Learn how to use this space link
		Then the page should display the text "How To Use Pinbar"
		And the page should contain the instruction "Use pin icon on the right top corner of page to create fast access link in the pinbar."

	@B30G16-245
	Scenario:  US3AC1  verify Driver click the Learn how to use this space 
		Given the user logged in as "driver"
		Then user is on "Dashboard" page
		When the user clicks the Learn how to use this space link
		Then the page should display the text "How To Use Pinbar"
		And the page should contain the instruction "Use pin icon on the right top corner of page to create fast access link in the pinbar."

	@B30G16-202
	Scenario:  US3AC2 verify store manger  should see an image on the page. 
		Given the user logged in as "store manager"
		Then user is on "Dashboard" page
		When the user clicks the Learn how to use this space link
		Then the page should contain an image source "https://qa.fleetapps.io/bundles/oronavigation/images/pinbar-location.jpg"

	@B30G16-246
	Scenario: US3AC2 verify sales  manger  should see an image on the page. 
		Given the user logged in as "sales manager"
		Then user is on "Dashboard" page
		When the user clicks the Learn how to use this space link
		Then the page should contain an image source "https://qa.fleetapps.io/bundles/oronavigation/images/pinbar-location.jpg"

	@B30G16-247
	Scenario:  US3AC2 verify driver should see an image on the page. 
		Given the user logged in as "driver"
		Then user is on "Dashboard" page
		When the user clicks the Learn how to use this space link
		Then the page should contain an image source "https://qa.fleetapps.io/bundles/oronavigation/images/pinbar-location.jpg"