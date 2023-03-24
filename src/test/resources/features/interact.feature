@wip
Feature: Interact with employees on the posts functionality

    Background: Verify user type 'Human Resource ' can login
        Given user is on the login page
        When user enters username "hr1@cybertekschool.com"
        And user enters password "UserUser"
        Then clicks to the Log In button
        And user lands on the home page.


    @CTSL10-309
    Scenario: User should be able to make a comment, like or unfollow on other employees' posts.
    When User makes a "Hi Guys" on other employees' posts
    And User likes other employees' posts
    And User unfollows other employees' posts
    Then User sees his post, like and unfollow command

    @CTSL10-310
    Scenario: User should be able to like, replay his/her own comment.
    When User likes  his/her own comment
    Then User replays his/her own comment

    @CTSL10-311
    Scenario: User should be able to see the reviewers' name and visit their profiles by clicking on reviewers' name
    When User sees the reviewers' name
    And User cliks on reviewers' name
    Then User visits  their profiles

    @CTSL10-312
    Scenario: User should be able to add others' posts to favorite by clicking on the Star icon
    When User adds others' posts to favorite by clicking on the Star icon.
    Then User sees their post on favorites





