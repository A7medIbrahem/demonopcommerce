@smoke

  Feature:F05_hovercategories | user could select subcategory
   Scenario: user could hoverCategories feature and select subcategory
    When user select and hover random main category
    And user select randomly one of sub categories
    Then sub category page will open
