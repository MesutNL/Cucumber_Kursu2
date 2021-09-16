Feature: Item Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline:
    And Navigate to Item Category page
    When  User create a item categories name as "<InventoryItemNAme>" short name as"<UserTypeOption>"
    Then Success message should be displayed
    And User delete the "<InventoryItemNAme>"
    Then Success message should be displayed



    Examples:
      | InventoryItemNAme | UserTypeOption |
      | PC3              | Teacher        |
      | Projector29       | Teacher        |
      | Computer23        | Tenant Admin   |
