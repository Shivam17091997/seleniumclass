Feature: Dropdown

  Scenario: verify that user is able to select
    Given User is on the website
    When user click on dropdown
    Then user should able to select


    Scenario: Verify that dropdown should have two options
      Given User is on the website
      When  user click on dropdown
      Then It must have two options

