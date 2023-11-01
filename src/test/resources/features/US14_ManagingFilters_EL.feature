@B30G16-205
Feature: Default

  Background:
		#@B30G16-187
    Given the user is on the login page


  @B30G16-203
  Scenario: US14AC1 verify store managers should see all 5 filter options are checked by default
    Given the user logged in as "store manager"
    Then user is on "Dashboard" page
    Then user is on marketing page
    When user clicks on 'Manage filters' button
    Then user should see all 5 filter options provided below checked
      | Name       |
      | Code       |
      | Start Date |
      | End Date   |
      | Budget     |

  @B30G16-204
  Scenario: US14AC2 verify any amount of boxes should be unchecked for store manager user
    Given the user logged in as "store manager"
    Then user is on "Dashboard" page
    Given user is on marketing page
    When user clicks on 'Manage filters' button
    And user unchecks 2 boxes
    Then user should still see remaining filters

  @B30G16-218
  Scenario: US14AC2 verify any amount of boxes should be unchecked for sales manager user
    Given the user logged in as "sales manager"
    Then user is on "Dashboard" page
    Given user is on marketing page
    When user clicks on 'Manage filters' button
    And user unchecks 2 boxes
    Then user should still see remaining filters

  @B30G16-217
  Scenario: US14AC1 verify sales managers should see all 5 filter options are checked by default
    Given the user logged in as "sales manager"
    Then user is on "Dashboard" page
    Then user is on marketing page
    When user clicks on 'Manage filters' button
    Then user should see all 5 filter options provided below checked
      | Name       |
      | Code       |
      | Start Date |
      | End Date   |
      | Budget     |