@B30G16-195
Feature: US13- As a user, I want to manage filters on the Vehicle Costs page.
  Background:
    Given the user is on the login page


  @B30G16-194
  Scenario Outline:US13AC1 Verify the user checks the first checkbox to check all the Vehicle Costs
    Given the user logged in as store manager by entering "<username>" and "<password>"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    And users check the first checkbox to check all the Vehicle Costs
    Then user should seethe  all the Vehicle Costs are checked
    Examples:
      | username       | password    |
      | storemanager51 | UserUser123 |
      | storemanager52 | UserUser123 |
      | storemanager53 | UserUser123 |

@B30G16-191
Scenario Outline: US13AC2 Verify the user sees 3 columns on the Vehicle Cost page.
    Given the user logged in as store manager by entering "<username>" and "<password>"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    Then the user should see the following column names
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    Examples:
      | username       | password    |
      | storemanager51 | UserUser123 |
      | storemanager52 | UserUser123 |
      | storemanager53 | UserUser123 |

  @B30G16-193
  Scenario Outline: US13AC3 Verify the user checks the first checkbox to check all the Vehicle Costs
    Given the user logged in as driver by entering "<username>" and "<password>"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    And users check the first checkbox to check all the Vehicle Costs
    Then user should seethe  all the Vehicle Costs are checked

    Examples:
      | username | password    |
      | user1    | UserUser123 |
      | user2    | UserUser123 |
      | user3    | UserUser123 |

  @B30G16-185
  Scenario Outline: US13AC4 Verify the user sees 3 columns on the Vehicle Cost page.
    Given the user logged in as driver by entering "<username>" and "<password>"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    Then the user should see the following column names
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    Examples:
      | username | password    |
      | user1    | UserUser123 |
      | user2    | UserUser123 |
      | user3    | UserUser123 |

@B30G16-223
  Scenario Outline: US13AC5 Verify the user sees 3 columns on the Vehicle Cost page.
    Given the user logged in as sales manager by entering "<username>" and "<password>"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    Then the user should see the following column names
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | salesmanager102 | UserUser123 |
      | salesmanager103 | UserUser123 |

 @B30G16-222
  Scenario Outline:US13AC6  Verify the user checks the first checkbox to check all the Vehicle Costs
    Given the user logged in as sales manager by entering "<username>" and "<password>"
    Then user is on "Dashboard" page
    Then the user selects Vehicle Cost from Fleet module
    And users check the first checkbox to check all the Vehicle Costs
    Then user should seethe  all the Vehicle Costs are checked
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | salesmanager102 | UserUser123 |
      | salesmanager103 | UserUser123 |




