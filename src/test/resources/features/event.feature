@Halit
Feature:User use all Event functionality

  Background: Verify user type 'Human Resource ' can login
    Given user is on the login page
    When user enters username "hr11@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.
    When user click to event button

  @CTSL10-380
  Scenario Outline: User should be able to add Event start and ending date and time,
  select "All day" and specify the time zone.
    And user add new event start date as "<Starting date>"
    And user add new event start time 8 and 30
    Then user add new event end date "<Ending date>"
    Then user add new event end time 17 and 30
    Then user specify the time zone as "<Time Zone>"
    Then user click all day radiobutton

    Examples:
      | Starting date | Ending date | Time Zone                        |
      | 23/04/2023    | 25/04/2023  | (UTC -07:00) America/Los_Angeles |
      | 01/01/2024    | 01/02/2024  | (UTC -11:00) Pacific/Midway      |
      | 17/07/2025    | 03/11/2025  | (UTC +03:00) Europe/Istanbul     |
      | 31/12/2023    | 01/01/2024  | (UTC +08:00) Australia/Perth     |

  @CTSL10-381
  Scenario Outline: User should be able to set reminder.
    And user click set reminder button
    Then user set remind count as 10
    Then user set remind "<type>"

    Examples:
      | type    |
      | minutes |
      | hours   |
      | days    |

  @CTSL10-382
  Scenario Outline: User should be able to select event location from dropdown.
    Then user set event location as "<Location>"
    Examples:
      | Location                  |
      | East Meeting Room         |
      | Central Meeting Room      |
      | West Meeting Room         |
      | Product Owner Office Room |

  @CTSL10-383
  Scenario Outline: User should be able to add members by selecting
  contacts individually or adding groups and departments.
    Then user click members bar
    Then user add "<Email>"
    Then user click Employees and department button
    Then user add "<groupname>" group
    Then user click All department and sub-department radiobutton about "<groupname>"
    Examples:
      | Email                          | groupname   |
      | hr99@cybertekschool.com        | Everything2 |
      | hr10@cybertekschool.com        | Parent      |
      | helpdesk20@cybertekschool.com  | Tester2     |
      | helpdesk30@cybertekschool.com  | group17     |
      | marketing40@cybertekschool.com | Everything2 |
      | marketing50@cybertekschool.com | Developer   |


  @CTSL10-384
  Scenario Outline: User should be able to send message by filling the mandatory fields
    And user click event name bar
    Then user write "<event name>"
    Then click send event button
    Examples:
      | event name       |
      | Grooming Meeting |
      | Demo Meeting     |
      | Retro Meeting    |


  @CTSL10-385
  Scenario: User should be able to cancel sending event at any time before sending.
    And user click event name bar
    Then user write "event name"
    Then user cancel event

    When user click to event button
    Then user click members bar
    Then user add "hr15@cybertekschool.com"
    Then user click Employees and department button
    Then user add "group17" group
    Then user click All department and sub-department radiobutton about "group17"
    Then user cancel event

    When user click to event button
    And user add new event start date as "12/07/2025"
    And user add new event start time 10 and 00
    Then user add new event end date "03/11/2025"
    Then user add new event end time 17 and 00
    Then user specify the time zone as "(UTC -07:00) America/Los_Angeles"
    Then user click all day radiobutton
    Then user cancel event