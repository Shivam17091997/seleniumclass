Feature: Login functionality

  Scenario: Verify user is able to login after enter valid username and password

    Given User is on the website
    When user enter username and password
    Then  user should be able to login

    Scenario: Verify login button should be visible
      Given User is on the website
      Then login button should be visible

