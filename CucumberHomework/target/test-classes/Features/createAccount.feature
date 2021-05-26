Feature: Feature to check create account functionality on automationpractice.come

  Scenario: Check create account form on automationpractice.com
    Given User is on login page
    When user populates all mandatory fields
    And clicks register button
    Then user validates the he is on My account page
