Feature: Default

  Background: user is already logged in
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.



  @CTSL10-357
  Scenario: Verify that user sends a message by filling the mandatory fields.
    Given user clicks Message Tab on the Navigation Bar
    When user write a message to 'Message Content' field
    And choose recipient from recipient input
    And clicks to the Send button
    Then verifies that the message is displayed on the Activity Stream

  @CTSL10-358
  Scenario: Verify that user can not sends a message by not filling the 'Message Content' mandatory fields.
    Given user clicks Message Tab on the Navigation Bar
    When user does not write a message to 'Message Content' field
    And choose recipient from recipient input
    And clicks to the Send button
    Then verifies that the message is not displayed on the Activity Stream
    And verifies to see that 'The message title is not specified.' text as error message

  @CTSL10-359
  Scenario: Verify that user can not sends a message by not filling the 'Recipient' mandatory fields.
    Given user clicks Message Tab on the Navigation Bar
    When user write a message to 'Message Content' field
    And does not choose recipient from recipient input
    And clear default recipients from the recipient input
    And clicks to the Send button
    Then verifies that the message is not displayed on the Activity Stream
    And verifies to see that 'Please specify at least one person.' text as error message

  @CTSL10-360
  Scenario: Verify that The message delivery is 'All employees' by default and it is changeable.
    Given user clicks Message Tab on the Navigation Bar
    When user checks recipient input and should verifies that 'All Employees' as default recipient
    And user clicks 'Add more' button and should be able to add more recipients
    And user should be able to delete recipients
    And clicks to the Send button
    Then verifies that the message is not displayed on the Activity Stream

  @CTSL10-361
  Scenario: Verify that user can cancel sending messages at any time before sending.
    Given user clicks Message Tab on the Navigation Bar
    When user write a message to 'Message Content' field
    And choose recipient from recipient input
    And clicks to the Cancel button
    Then verifies that the message is not displayed on the Activity Stream