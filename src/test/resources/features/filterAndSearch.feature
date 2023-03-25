Feature : Filter and search functionality
  As a user, I should be able to use "Filter and search" functionality on Active Stream.

  Background:Verify user type 'Human Resource ' can login
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.

  Scenario: Verifying to see default filters
    When user is on home page, hover over and clicks the filter and search box
    Then user should be able to see default filters as my activity, work, favorite, announcements and workflows



    #1. User should be able to see default filters as "my activity, work, favorite, announcements, and workflows".
    #2. User should be able to add and remove fields.
    #3. User should be able to search by specifying the Date.
    #4. User should be able to search by selecting single type.
    #5. User should be able to search by selecting multiple types.
    #6. User should be able to save the filter.
    #7. User should be able to restore the default field.
    #8. User should be able to reset filters to default.
