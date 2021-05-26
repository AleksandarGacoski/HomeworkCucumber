#Author
#Date
Feature: feature to test login functionality on automationpractice

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated on login page