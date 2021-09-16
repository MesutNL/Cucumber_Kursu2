Feature: Testing JDBC Country

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

    Scenario: Country Testing with JDBC

      Then Send The Query the database "select * from country2" and control match
