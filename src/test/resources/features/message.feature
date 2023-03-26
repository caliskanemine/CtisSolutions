Feature: Message functionality
  Background: For the scenarios in the feature file user is expected to be on login page
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.
    When User should click Message button

  @CTSL10-348
  Scenario: Verify that user should be able to upload multiple files at the same time
    And User should see Upload Files button and click it
    And User should Upload "3 files or images at the same time"

  @CTSL10-349
  Scenario:Verify that user should be able to upload files in different formats
    And User should see Upload Files button and click it
    Then User should Upload "files in different formats(txt,pdf,docx)"

  @CTSL10-351 @CTSL10-350  @CTSL10-353 @CTSL10-354

  Scenario: Verify that user should be able to upload pictures
    And User should see Upload Files button and click it
    And User should Upload "Upload images"
    Then User should click insert in text button
    Then User should change file's name
    Then User should remove files and images





