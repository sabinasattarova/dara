@login
Feature: Users should be able to login

  Background: User is already in the login page
    Given the user is on the login page


  Scenario: Login with parameterization
    When user enters the "store manager" information
    Then user is on Home page
