Feature: Google Search

  Scenario: Search Selenium on Google
    Given user is on Google page
    When user enters "Selenium"
    And clicks on search button
    Then user should see search results