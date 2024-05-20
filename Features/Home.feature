Feature: Ebay Home Page Scenario

  @P1 @P2
  Scenario: Advanced Search Link
    Given I am on Ebay Home Page
    When I click on Advanced button
    Then I navigate to Advanced search link

  @P3 @setCookies
  Scenario: Search item counts
    Given I am on Ebay Home Page
    When I search for 'iphone11'
    Then validate atleast 1000 search items present

  @P4 @setCookies @P10
  Scenario: Search item counts2
    Given I am on Ebay Home Page
    When I search for 'toys'
    Then validate atleast 100 search items present

  @P5 @setCookies @Test
  Scenario: Search item counts3
    Given I am on Ebay Home Page
    When I search for 'soap' in the 'baby' category
    Then validate atleast 50 search items present

  @P7
  Scenario Outline: Show the items
    Given I am on Ebay Home Page
    When I click on '<link>'
    Then I validate the '<url>' and '<title>'

    Examples: 
      | link                 | url                                                   | title                                |
      | Fashion              | https://www.ebay.com/b/Fashion/bn_7000259856          | Fashion products for sale            |
      | Collectibles and Art | https://www.ebay.com/b/Collectibles-Art/bn_7000259855 | Collectibles & Art products for sale |
      | Health & Beauty      | https://www.ebay.com/b/Health-Beauty/26395/bn_1865479 | Health & Beauty products for sale    |
