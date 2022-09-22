Feature: Sorting Functionality

  Scenario: Search product with sorting Name Z to A
    Given I have logged in and added one product to the cart
    When I click button sorting
    And I select Name Z to A
    Then page inventory showed the product name from Z to A