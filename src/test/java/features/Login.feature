@all
Feature: User Login
Registered user should be able to login to access account details

Background: 
Given User navigates to Login page

@login @validcredentials @smoke @regression
Scenario Outline: Login with valid credentials
When User enters valid email address <email>
And enters valid password <password> 
And clicks on Login button
Then User should be able to login successfully
And access account details
Examples:
|email|password|
|abc@gmail.com|12345|
|shailaja.sireesh@gmail.com|12345|

@login @invalidcredentials @smoke
Scenario: Login with invalid credentials		
When User enters invalid email address "abc1234@gmail.com"
And enters invalid password "1234567"
And clicks on Login button
Then User should not be able to login successfully
And user get proper warning message

@login @nocredentials 
Scenario: Login without providing credentials 
When User dont enter any credentials
And clicks on Login button
Then User should not be able to login successfully
And user get proper warning message

@login @invalidemailandvalidpwd
Scenario: Login with invalid email credentials and valid password
When User enters below invalid email address and valid password 
|email|xyz@gmail.com|
|password|12345| 
And clicks on Login button
Then User should not be able to login successfully
And user get proper warning message

@dev
Scenario: Login without entering  invalid email credentials and valid password
When User enters invalid email address "xyz@gmail.com"
And enters valid password "12345"
And clicks on Login button
Then User should not be able to login successfully
And user get proper warning message
