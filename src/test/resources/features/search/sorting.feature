Feature: Sorting Functionality

  Scenario Outline: Search product with sorting Name Z to A
    Given I already logged in
    And I already added one item to cart
    When I click sort by "<Filter>"
    Then the product will be sorting by "<Filter>"
    Examples:
      | Filter        |
      | Name (Z to A) |
