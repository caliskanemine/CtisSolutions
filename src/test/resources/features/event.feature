@wip
Feature:User use all Event functionality

  Background: Verify user type 'Human Resource ' can login
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.
    When user click to event button

  @first
  Scenario: User should be able to add Event start and ending date and time,
  select "All day" and specify the time zone.
    And user add new event start date as "23/04/2023"
    And user add new event start time 8 and 30
    Then user add new event end date "25/04/2023"
    Then user add new event end time 17 and 30
    Then user specify the time zone as "(UTC -07:00) America/Los_Angeles"
    Then user click all day radiobutton

  @second
  Scenario: User should be able to set reminder.
    And user click set reminder button
    Then user set remind count as 3
    Then user set remind type

  @third
  Scenario: User should be able to select event location from dropdown.
    Then user set event location as "East Meeting Room"

  @fourth
  Scenario: User should be able to add members by selecting
  contacts individually or adding groups and departments.
    Then user click members bar
    Then user add "hr15@cybertekschool.com"
    Then user add "helpdesk20@cybertekschool.com"
    Then user click Employees and department button
    Then user add "group15" group
    Then user click All department and sub-department radiobutton about "group15"

  @fifth
  Scenario: User should be able to send message by filling the mandatory fields
    And user click event name bar
    Then user write "event name"
    Then click send button

  @sixth
  Scenario: User should be able to cancel sending event at any time before sending.
    And user click event name bar
    Then user write "event name"
    Then user cancel event

    When user click to event button
    Then user click members bar
    Then user add "hr15@cybertekschool.com"
    Then user add "helpdesk20@cybertekschool.com"
    Then user click Employees and department button
    Then user add "group15" group
    Then user click All department and sub-department radiobutton about "group15"
    Then user cancel event

    When user click to event button
    And user add new event start date as "12/07/2025"
    And user add new event start time 10 and 00
    Then user add new event end date "03/11/2025"
    Then user add new event end time 17 and 00
    Then user specify the time zone as "(UTC -07:00) America/Los_Angeles"
    Then user click all day radiobutton
    Then user cancel event





