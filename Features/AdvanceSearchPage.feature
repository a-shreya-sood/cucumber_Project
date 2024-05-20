Feature: Advance Search Page

  Scenario: Ebay Logo on Advance Search Page
    Given I am advance seach page
    When I click on ebay logo
    Then I navigate back to ebay home page

  @P6 @setCookies
  Scenario: Seaching items in Advance Search Page
    Given I am advance seach page
    When I Advance Seach at an item
      | keyword  | exclude     | min | max |
      | iPhone11 | refurbished | 300 | 900 |
