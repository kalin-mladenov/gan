Feature: Registration on MoneyGaming.com

  As a new MoneyGaming.com player
  I want to be able to register using my full details
  So that I can play online casino games

  Scenario: Successful registration with valid password
    Given I am on the registration page
    When I fill in my details with a valid password "Passw0rd!"
    And I accept the Terms and Conditions
    And I click the Register button
    Then I should be redirected to the login page

  Scenario: Registration fails when password is too short
    Given I am on the registration page
    When I fill in my details with a password "Pa!1" that is too short
    And I accept the Terms and Conditions
    And I click the Register button
    Then I should see an error message "Password must be at least 6 characters long"

  Scenario: Registration fails when password has no numbers
    Given I am on the registration page
    When I fill in my details with a password "Password!" that has no numbers
    And I accept the Terms and Conditions
    And I click the Register button
    Then I should see an error message "Password must contain at least one number"

  Scenario: Registration fails when password has no special characters
    Given I am on the registration page
    When I fill in my details with a password "Password1" that has no special characters
    And I accept the Terms and Conditions
    And I click the Register button
    Then I should see an error message "Password must contain at least one special character"

  Scenario: Registration fails when password is too short and has no numbers or special characters
    Given I am on the registration page
    When I fill in my details with a password "Passw" that is too short and has no numbers or special characters
    And I accept the Terms and Conditions
    And I click the Register button
    Then I should see error messages "Password must be at least 6 characters long" and "Password must contain at least one number" and "Password must contain at least one special character"