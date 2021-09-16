Feature: Country Create Edit Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Create a country
    When Create a country name as "mesut2530" code as "code3222"
    Then Success message should be displayed

  Scenario: Edit a country

    When User edit the "mesut2530" to "mesut2526"
    Then Success message should be displayed

  Scenario: Delete a country

    When User delete the new "mesut2526"
    Then Success message should be displayed

