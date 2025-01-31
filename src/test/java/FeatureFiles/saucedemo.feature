Feature: SauceDemo Application

  Scenario: validate login page functionality
    Given user is on login page
    When user enter username as "standard_user" and password as "secret_sauce"
    Then user click on login button

  Scenario: validate product page functionality
    When user should sort the product
    Then user should select product
    Then user should click on shopping cart button

  Scenario: validate container page functionality
    When user should click on checkout button

  Scenario: validate personal details functionality
    When user enter personal details firstname "Kunal" and lastname "Gajare" and postal code "425201"
    Then user click on continue button

  Scenario: validate checkout page functionality
    When user should click on finish button
