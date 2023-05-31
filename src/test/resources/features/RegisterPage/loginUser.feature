@Test
Feature: user login
  As user want to login

@PostiveCase
  Scenario: user login with valid data
    Given user already on page login
    When  User input username
    And   user input password
    And   user click button login
    Then  user succefully login to dashboard

@NegatifCase
  Scenario: user login with invalid data
    Given user already on page login
    When  User input username and password invalid data
    And   user click button login
    Then  user see notif Invalid credentials

