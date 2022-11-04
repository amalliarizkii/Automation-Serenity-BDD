Feature: Continue Donasi Functionallity

  Scenario: Continue Donasi after donasi in one of the campaign
    Given I already on home page
    When I click one of the campaign
    Then I redirected to the campaign page
    When I click Donasi button
    Then I reditected to the donasi amount page
    When I input 10000 in nominal donasi lainnya field
    And I click Lanjut pembayaran button
    Then I redirected to payment method page
    When I click pilih button
    Then I redirected to select payment method page
    When I click BCA Virtual Account for payment method
    Then I redirected to payment method page
    When I input name "Hafiza Lubna"
    And I input phone number 081911636328
    And I click Lanjut pembayaran lagi button
    Then I redirected to instruksi pembayaran page
    When I click donasi ke penggalangan lain
    Then I redirected to home page