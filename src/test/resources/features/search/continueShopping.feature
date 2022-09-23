Feature: Continue Shopping Functionality

  Scenario Outline: Continue shopping after remove one item from cart
    Given I already logged in
    And I already added one item to cart
    When I click sort by "<Filter>"
    Then the product will be sorting by "<Filter>"
    When I select product "add-to-cart-test.allthethings()-t-shirt-(red)"
    And I click shopping cart
    Then I redirected to cart page
    When I remove product "remove-test.allthethings()-t-shirt-(red)"
    And I click button continue shopping
    Then I redirected to inventory page
    Examples:
      | Filter        |
      | Name (Z to A) |