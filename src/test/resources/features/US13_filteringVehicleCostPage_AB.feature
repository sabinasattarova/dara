@B30G16-195
Feature: Default
  Background:
    Given the user is on the login page


  @B30G16-191
  Scenario: US13AC1 Verify the user sees 3 columns on the Vehicle Model page.
    Given the user logged in as "store manager"
    Then the user selects Vehicle Cost from Fleet module
    Then the user should see the following column names
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


