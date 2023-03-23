Feature: Default

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