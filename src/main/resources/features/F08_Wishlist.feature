@smoke
  Feature: F08_Wishlist | click on wishlist
    Scenario: user could click on wishlist button
      When user click on wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"
      Then success message is displayed with green background
    Scenario: user could add more than one product to wishlist
      When user click on wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"
      And user click on Wishlist Tab on the top of the page
      Then the Qty value will be bigger than 0
