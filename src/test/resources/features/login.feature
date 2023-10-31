@login
Feature: Users should be able to login

  Background: User is already in the login page
    Given the user is on the login page


  Scenario: Login with parameterization
    Given the user logged in as "store manager"
    Then user is on "Dashboard" page
