Feature: Removing Functionality

  Scenario: Remove the last added item from cart
    Given I have logged in and added one product to the cart
    When I click button sorting
    And I click Name (Z to A)
    And I click button add to cart for item "Test.allTheThings() T-Shirt (Red)"
    And I click shopping cart
    And I click button remove for item "Test.allTheThings() T-Shirt (Red)"
    Then item will deleted