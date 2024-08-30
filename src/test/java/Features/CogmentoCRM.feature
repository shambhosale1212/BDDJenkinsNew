Feature: Test End to End Cogmento Functionality

  Scenario: Validate login Functionality
    Given user is on login page
    When user enter valid credentials
    Then user click on login button
