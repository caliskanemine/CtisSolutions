
Feature: As a user,I should be able to add link, insert video, mention,
  quote, add tag in Appreciation

  Background: user is already logged in
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.

Scenario: User should be able to add mentions in appreciation
  When User clicks on More button
  And User clicks on Appreciation button
  And User writes message
  And User clicks on mention
  Then User chooses hr1@cybertekschool.com from list
  And User can see the hr1@cybertekschool.com as mention beside message


















