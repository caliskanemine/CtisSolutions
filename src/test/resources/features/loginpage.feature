Feature: Default



	@CTSL10-321
	Scenario: Verify user type 'Human Resource ' can login
		Given user is on the login page
		When user enters username "hr1@cybertekschool.com"
		And user enters password "UserUser"
		Then clicks to the Log In button
		And user lands on the home page.

	@CTSL10-323
	Scenario: Verify user type 'Help Desk ' can login
		Given user is on the login page
		When user enters username "helpdesk1@cybertekschool.com"
		And user enters password "UserUser"
		Then clicks to the Log In button
		And user lands on the home page.

	@CTSL10-322
	Scenario: Verify user type 'Marketing ' can login
		Given user is on the login page
		When user enters username "marketing1@cybertekschool.com"
		And user enters password "UserUser"
		Then clicks to the Log In button
		And user lands on the home page.

