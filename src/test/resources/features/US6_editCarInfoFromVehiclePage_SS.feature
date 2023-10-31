@B30G16-213
Feature: US6- As a user, I want to see edit car info icons from the Vehicle page.

  Background:
		#@B30G16-187
    Given the user is on the login page


  @B30G16-209
  Scenario: US6AC1 Sales Manager should see “view, edit, delete” when they hover the mouse over the 3 dots “…”
    Given the user logged in as "sales manager"
    Then user is on "Dashboard" page
    And user chooses "Vehicle Model" from Fleet drop-down
    Then user hovers over on three dots on car table line following options should appear
      | view   |
      | edit   |
      | delete |


  @B30G16-192
  Scenario: US6AC1 Store Manager should see “view, edit, delete” when they hover the mouse over the 3 dots “…”
    Given the user logged in as "store manager"
    Then user is on "Dashboard" page
    And user chooses "Vehicle Model" from Fleet drop-down
    Then user hovers over on three dots on car table line following options should appear
      | view   |
      | edit   |
      | delete |


  @B30G16-212
  Scenario: US6AC1 Driver should see error message when they try to go to "Vehicle Model" page
    Given the user logged in as "driver"
    Then user is on "Dashboard" page
    And user chooses "Vehicle Model" from Fleet drop-down
    Then user sees error msg "You do not have permission to perform this action."