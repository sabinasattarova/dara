@StoreManager
Feature: Managing filters for store manager users

  Background:
    Given user logs in as store manager user

  @B30G16-203
  Scenario: Store managers should see all 5 filter options are checked by default
    Given user is on marketing page
    When user clicks on 'Manage filters' button
    Then user should see all 5 filter options provided below checked
      | Name       |
      | Code       |
      | Start Date |
      | End Date   |
      | Budget     |

  @B30G16-204
  Scenario: Any amount of boxes should be unchecked
    Given user is on marketing page
    When user clicks on 'Manage filters' button
    And user unchecks 2 boxes
    Then user should still see remaining filters