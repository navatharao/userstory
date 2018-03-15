
@regression
Feature: Checking the submittal form

  Background:
  Given I am on AgileTrailBlazer's Contact.html page
  

  @tag2
  Scenario Outline: Checking the Contact form with Positive Test Cases
    Given I enter "<name>" in the name field
    And I enter "<email>" in the email field
    And I enter "<phone>" in the phone number field
    And I enter "<office>" in the office number field
    And I pick "<subject>" in the subject field
    And I enter a "<message>" in the message field
    When I click on the submit button
    Then I should get success message

    Examples: 
      | name  | email             | phone     | office			| subject | message |
      | John  | john@gmail.com    | 123456789 | 123456789   |Agile    |  john   |
      | ramsay|   ram.r@gmail.com |           |             | Scrum   |  ramsay |
      
      
 Scenario Outline: Checking the Contact form with Negative Test Cases
    Given I enter "<name>" in the name field
    And I enter "<email>" in the email field
    And I enter "<phone>" in the phone number field
    And I enter "<office>" in the office number field
    And I pick "<subject>" in the subject field
    And I enter a "<message>" in the message field
    When I click on the submit button
    Then I should get the alert messages for empty required fields and a failure message

    Examples: 
      | name  | email             | phone     | office			| subject | message |
      | John  | john@gmail.com    | 123456789 | 123456789   |Agile    |  john   |
      | ramsay|   ram.r@gmail.com |           |             | Scrum   |  ramsay |
