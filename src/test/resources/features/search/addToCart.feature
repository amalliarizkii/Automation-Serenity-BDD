Feature: Add to cart Functionality

  Scenario: Add 1 item to cart
    Given I already logged in
    When I select item "add-to-cart-sauce-labs-backpack"
    Then item will be added to cart