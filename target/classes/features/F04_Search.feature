@smoke

Feature: F04_Search | user could search on different products

  Scenario Outline: user could search using product name

    When user enter name as "<product name>"
    And user click on search button
    Then user get search results

    Examples:
    |product name|
      |book|
      |laptop|
      |nike|

  Scenario Outline: user could search for product using sku

    When user enter name as "<product sku>"
    And user click on search button
    Then user get search results

    Examples:
      |product sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|