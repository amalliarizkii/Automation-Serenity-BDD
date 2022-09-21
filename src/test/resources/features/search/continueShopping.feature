Feature: Continue Shopping Functionality

  Scenario: Continue shopping after remove one item from cart
    Given I have logged in and added one product to the cart
    When I click button add to cart for item "Test.allTheThings() T-Shirt (Red)"
    And I click shopping cart
    And I click button remove for item "Test.allTheThings() T-Shirt (Red)"
    And I click button continue shopping
    Then page will showed the inventory product