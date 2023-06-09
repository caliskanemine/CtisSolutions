Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

	Background: user is already logged in
		Given user is on the login page
		When user enters username "hr1@cybertekschool.com"
		And user enters password "UserUser"
		Then clicks to the Log In button
		And user lands on the home page.


	@CTSL10-316 @CTSL10-315 @CtisSolutions
	Scenario: User should be able to add users, add questions and answers, delete questions and answers with multiple choices
		Given User clicks POLL tab
		And User writes a title in message box
		When User clicks Add more
		And User clicks Employees and departments
		And User select multiple contacts
		And User click x for closing
		And User clicks Question and write a question
		And User clicks AnswerFirst and write an answer
		And User clicks AnswerSecond and write an answer
		And User clicks AnswerThird and write an answer
		And User clicks Allow multiple choise  checkbox 
		And User clicks SEND button
		And User clicks More button
		And User clicks Delete  button
		And User clicks OK  button
		Then Verify "The post has been deleted." message is displayed


	@CTSL10-320 @CTSL10-315 @CtisSolutions
	Scenario: User should see an error message if title message box is empty
		Given User clicks POLL tab
		And User leaves blank in title message box, with default recipient
		And User clicks SEND button
		Then Verify "The message title is not specified" message is displayed.


	@CTSL10-319 @CTSL10-315 @CtisSolutions
	Scenario: User should see an error message if there is no recipient
		Given User clicks POLL tab
		And User writes a title in message box
		And User remove all recipients by clicking x
		And User clicks SEND button
		Then Verify the message "Please specify at least one person." is displayed