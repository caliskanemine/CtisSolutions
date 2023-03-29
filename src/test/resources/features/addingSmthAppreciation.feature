
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
    And User can see who are mentioned in the TO field

  Scenario: User should be able to attach a link to the specified text
    When User clicks on More button
    And User clicks on Appreciation button
    And User clicks link button
    And User writes a text into the text box
    And User adds an url into the link box
    And User clicks the save button
    And User clicks send button
    Then User can see the message as url under the activity stream


  Scenario:  User should be able to insert Vimeo videos
    When User clicks on More button
    And User clicks on Appreciation button
    And User clicks insert video button
    And User enters url vimeo link into the video source box
    And User clicks save button
    And User clicks to send button
    Then User can see the usertype on the video


  Scenario:  User should be able to insert Youtube videos
    When User clicks on More button
    And User clicks on Appreciation button
    And User clicks insert video button
    And User enters url youtube link into the video source box
    Then User see the error message


















