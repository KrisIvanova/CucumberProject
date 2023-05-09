@smoke
Feature: As a user
  I want to get ability to use menu sections
  So that I can

  Scenario: Docs sections should contains appropriate columns
    Given the user opens Onliner website
    When the user clicks on the "Каталог" section
    And the user clicks on the "Дом и сад" classification
    And the user clicks on the "Садовая техника и инструменты" category
    And the user clicks on the "Триммеры" product
    And the user clicks on the product item
    And the user confirms the city
    And the user adds item to cart
    Then cart with product is displayed
