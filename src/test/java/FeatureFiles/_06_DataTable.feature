Feature: DataTable Functionality


  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully



  Scenario: Create a Country


    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | country    |
    And Click on the element in The Dialog
      | addButton |
    When User sending the keys in Dialog Content
      | name | Mesut  |
      | code | Asitan |
    And Click on the element in The Dialog
      | save |
    And User should login successfully


  Scenario: Create a Nationalities


    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | Nationalities |
    And Click on the element in The Dialog
      | addButton |
    When User sending the keys in Dialog Content
      | name | Mesut1 |
    And Click on the element in The Dialog
      | save |
    Then Success message should be displayed


  Scenario: Create a Fees


    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | Fees |
    And Click on the element in The Dialog
      | addButton |
    When User sending the keys in Dialog Content
      | name | Mesut123 |
      | code | Mesut123 |
      | integrationcode | 12133 |
      | priority | 123123 |
    And Click on the element in The Dialog
      | save |
    Then Success message should be displayed
    And User delete the "Mesut123"
    Then Success message should be displayed

