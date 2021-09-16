Feature: Citizenship with scenario Outline


  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenships page

  Scenario Outline: Citizenship create and delete with scenario Outline
    When USer a Citizenships name as "<CitizenshipName>" short name as "<Shortname>"
    Then Success message should be displayed


    When USer a Citizenships name as "<CitizenshipName>" short name as "<Shortname>"
    Then Already exits should be displayed
    And Click on clos button

    When User delete the "<CitizenshipName>"
    Then Success message should be displayed




    Examples:
      | CitizenshipName | Shortname |
      | Mesutish9       | ms9       |
      | Mesutish10      | ms10      |
      | Mesutish11      | ms11      |
      | Mesutish12      | ms12      |