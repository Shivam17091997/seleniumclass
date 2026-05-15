Feature: login functionality

  Scenario: valid login
    Given user is on login page
    When user enter valid user name and valid password
    And  click on the login button
    Then user is on dashboard screen


    Scenario: Invalid login
      Given user is on login page
      When user enter invalid username and password
      Then error message have been displayed
