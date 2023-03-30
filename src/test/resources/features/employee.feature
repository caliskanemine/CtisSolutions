Feature: Default

  Background:user is already logged in
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.
    When user should click Employee tab

  @CTSL10-388
  Scenario:Verify all user types should be able to display company structure
    Then user should see Company Structure tab
    When user select log out
    And different user enter
    When user enters username "helpdesk1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    Then user should see Company Structure tab
    When user select log out
    And different user enter
    When user enters username "marketing1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    Then user should see Company Structure tab


  @CTSL10-389 @CTSL10-390 @CTSL10-391
  Scenario:Verify that Hr user should be able to add a department from the company structure and
  be able to select a parent department from the department dropdown should be able to select a supervisor
    When Hr user click ADD DEPARTMENT button
    And user write a name
    When user click Parent Department dropdown button
    When user click Select from structure button
    Then user select Company
    Then user select Search
    Then user select recent
    Then user select any
    And user click ADD button


  @CTSL10-393
  Scenario:Verify Hr user should be able to close add department pop-up at any time before sending
    When Hr user click ADD DEPARTMENT button
    And user write a name
    And user click CLOSE button

  @CTSL10-394-1
  Scenario:Verify Hr user should be able to edit departments and delete departments after adding the department
    When user hover over on a department
    And user click Add child department button
    And user write a name
    And user click ADD button

  @CTSL10-394-2
  Scenario:Verify Hr user should be able to edit add child departments
    When user hover over on a department
    And user click Edit department button
    And user write a new name
    And user click save button
    And user click Delete department button

  @CTSL10-395
  Scenario:Verify Hr user should be able to drag and drop the existing department under another department as a subdepartment
    When user drag and drop a department under another department

  @CTSL10-396
  Scenario:Verify Helpdesk and marketing users can not change company structure
    Then user see ADD DEPARTMENT button
    When user select log out
    And different user enter
    When user enters username "helpdesk1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    Then user should not see ADD DEPARTMENT button
    When user select log out
    And different user enter
    When user enters username "marketing1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    Then user should not see ADD DEPARTMENT button
