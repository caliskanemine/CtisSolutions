@CTSL10-417
Feature: As a user,I should be able to add link, insert video, mention,
  quote, add tag in Appreciation

  Background: user is already logged in
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.

   @CTSL10-409
  Scenario: User should be able to add mentions in appreciation
    When User clicks on More button
    And User clicks on Appreciation button
    And User writes message
    And User clicks on mention
    Then User chooses hr1@cybertekschool.com from list
    And User can see who are mentioned in the TO field

@CTSL10-410
  Scenario: User should be able to attach a link to the specified text
    When User clicks on More button
    And User clicks on Appreciation button
    And User clicks link button
    And User writes a text into the text box
    And User adds an url into the link box
    And User clicks the save button
    And User clicks send button
    Then User can see the message as url under the activity stream

@CTSL10-413
  Scenario: User should be able to cancel links before sending the message
    When User clicks on More button
    And User clicks on Appreciation button
    And User clicks link button
    And User writes a text into the text box
    And User adds an url into the link box
    And User clicks the save button
    And User clicks and clears the message area
    Then User sees the thanks hr good job message area is empty
@CTSL10-414
  Scenario: User should be able to cancel videos before sending the message
    When User clicks on More button
    And User clicks on Appreciation button
    And User clicks insert video button
    And User enters url vimeo link into the video source box
    And User clicks save button
    And User clicks and clears the message area
    Then User sees the message area is empty

@CTSL10-415
  Scenario: User should be able to add tags to messages.
    When User clicks on More button
    And User clicks on Appreciation button
    And User writes the message in to the message area
    And User click tags button
    And Types who one wants to add
    And User clicks to send button
    Then User can see the person who added besides Tag: word

@CTSL10-416
    Scenario: User should be able to remove tags before sending the message
      When User clicks on More button
      And User clicks on Appreciation button
      And User writes the message in to the message area
      And User click tags button
      And Types who one wants to add
      And User clicks x to remove the person from tag field
      Then User sees only +add more into the tags field

@CTSL10-411
  Scenario:  User should be able to insert Vimeo videos
    When User clicks on More button
    And User clicks on Appreciation button
    And User clicks insert video button
    And User enters url vimeo link into the video source box
    And User clicks save button
    And User clicks to send button
    Then User does not see the error message

 @CTSL10-412
  Scenario:  User should be able to insert Youtube videos
    When User clicks on More button
    And User clicks on Appreciation button
    And User clicks insert video button
    And User enters url youtube link into the video source box
    And User clicks save button
    And User clicks to send button
    Then User does not see the error message





















