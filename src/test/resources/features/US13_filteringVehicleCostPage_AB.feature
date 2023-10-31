@B30G16-195
Feature: Default

  Background:
  @B30G16-187

    When user enters the "userType" information
    Then user is on Home page


  @B30G16-191
  Scenario: US13AC1 Verify the user sees 3 columns on the Vehicle Model page.
    Given the user logged in as "store manager"
    Then the user selects Vehicle Cost from Fleet module
    And the user should see the following column names
      | Type        |
      | Total Price |
      | Date        |


  @B30G16-194
  Scenario: US13AC2 Verify the user checks the first checkbox to check all the Vehicle Costs
    Given the user logged in as "store manager"
    Then the user selects Vehicle Cost from Fleet module
    And users check the first checkbox to check all the Vehicle Costs
    Then user should see all the Vehicle Costs are checked