@wip_sinan
Feature: As a user, I should be able to upload files and pictures while sending appreciation
  Background: For the scenarios in the feature file user is expected to be on login page
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.

    When User should click More button
    And User should click Appreciation button

  @CTSL10-364
  Scenario: Verify that user should be able to upload multiple files at the same time(max. 3 files)
    When User should see Upload Files button and click
    Then User should upload "Max 3 attachments at the same time"

  @CTSL10-365
  Scenario:Verify that user should be able to upload files in different formats
    And User should see Upload Files button and click
    Then User should upload "files in different formats(txt,pdf,docx)"

  @CTSL10-366
  Scenario: Verify that user should be able to upload picture
    And User should see Upload Files button and click
    Then User should upload picture


  @CTSL10-367
  Scenario: Verify that user click insert in text button
    And User should see Upload Files button and click
    And User should upload picture
    Then User should click insert in text button


  @CTSL10-368
  Scenario: Verify that user should be able to remove files and images at any time before sending
    And User should see Upload Files button and click
    And User should upload picture
    Then User should remove attachments

  @CTSL10-369
  Scenario: Verify that user should be able to rename the file before sending.
    And User should see Upload Files button and click
    And User should upload "Upload files"
    Then User should change files name