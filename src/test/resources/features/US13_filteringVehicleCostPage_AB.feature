@B30G16-195
Feature: Default
  Background:
    Given the user is on the login page



  Scenario: US13AC1 Verify the user sees 3 columns on the Vehicle Model page.
    Given the user logged in as "store manager"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    Then the user should see the following column names
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


  Scenario: Verify the user checks the first checkbox to check all the Vehicle Costs
    Given the user logged in as "store manager"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    And users check the first checkbox to check all the Vehicle Costs
    Then user should seethe  all the Vehicle Costs are checked


  Scenario: US13AC1 Verify the user sees 3 columns on the Vehicle Model page.
    Given the user logged in as "sales manager"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    Then the user should see the following column names
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

  Scenario: Verify the user checks the first checkbox to check all the Vehicle Costs
    Given the user logged in as "sales manager"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    And users check the first checkbox to check all the Vehicle Costs
    Then user should seethe  all the Vehicle Costs are checked


  Scenario: US13AC1 Verify the user sees 3 columns on the Vehicle Model page.
    Given the user logged in as "driver"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    Then the user should see the following column names
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
  @B30G16-191
  Scenario: Verify the user checks the first checkbox to check all the Vehicle Costs
    Given the user logged in as "driver"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    And users check the first checkbox to check all the Vehicle Costs
    Then user should seethe  all the Vehicle Costs are checked