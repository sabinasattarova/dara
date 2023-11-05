@B30G16-249
Feature: Default

  Background:
		#@B30G16-187
    Given the user is on the login page


  @B30G16-229
  Scenario: US1AC1: Verifying store managers view 8 modules
    Given the user logged in as "store manager"
    Then user is on "Dashboard" page
    Then the "store manager" should see following menu bar options
      | Dashboards           |
      | Fleet                |
      | Customers            |
      | SaLes                |
      | Activities           |
      | Marketing            |
      | Reports and Segments |
      | System               |


  @B30G16-231
  Scenario: US1AC1: Verifying sales managers view 8 modules
    Given the user logged in as "sales manager"
    Then user is on "Dashboard" page
    Then the "sales manager" should see following menu bar options
      | Dashboards           |
      | Fleet                |
      | Customers            |
      | SaLes                |
      | Activities           |
      | Marketing            |
      | Reports and Segments |
      | System               |


  @B30G16-230
  Scenario: US1AC2 Verifying drivers viewing 4 modules
    Given the user logged in as "driver"
    Then the "driver" should see following menu bar options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |