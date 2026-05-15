Feature: Data driven testing of login


  Scenario Outline: login with multiple user

    @Given user is on login page
    @When user enter "<username>" and "<password>"
    @Then user is on dashboard screen

    Examples:
      | username | password |
      | admin    | admin123 |
      | user     | wrong    |




