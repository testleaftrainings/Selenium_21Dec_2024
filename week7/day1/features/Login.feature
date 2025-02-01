Feature: Login functionality of leaftaps application

@login @positive @regression
Scenario: Test the login functionality with valid test data
Given setup the test env
And enter the username as 'demosalesmanager'
And enter the password as 'crmsfa'
When click on the login button
Then login is successful

@login @negative @sanity
Scenario: Test the login functionality with invalid test data
Given setup the test env
And enter the username as 'demo'
And enter the password as 'crmsfa'
When click on the login button
But login is successful