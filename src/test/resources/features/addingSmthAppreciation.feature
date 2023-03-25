Feature: As a user,I should be able to add link, insert video, mention,
  quote, add tag in Appreciation


  Background: user is already logged in
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.

