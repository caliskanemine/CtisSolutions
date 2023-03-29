Feature: As a user, I should be able to assign tasks under Quick Navigate Menu.

  Background: user is already logged in
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.


  @CTSL10-399 @CtisSolutions
  Scenario: HR User should be able to create "High priority" tasks with the mandatory fields.
    Given User clicks Task tab
    And User writes into things to do title
    And User clicks high priority ckeckbox
    And User clicks send button
    Then Verify hr user creates high priority task with mandatory fields