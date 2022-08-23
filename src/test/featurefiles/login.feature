@regression1
Feature: Login functionality
  Background:
    Given I am on the home page
    When I select sign in tab
    Then I should be on the Authentication page

  @smoke1
  #Happy path test case
  Scenario: verifying user can login successfully with valid credentials
    When I enter email as testaccount123@mailinator.com & password as Password123
    And I select sign in link
    Then I should be logged in successfully
    And I should be on My account page

