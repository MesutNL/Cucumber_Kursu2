Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Entrance Scenario

    And Click on the element in the left Nav
      | EntranceExam  |
      | SetupTwo      |
      | EntranceExam2 |
    And Click on the element in The Dialog
      | addButton |
    When User sending the keys in Dialog Content
      | name | Mesut  |
    And Click on the element in the Form Content
    |academicPeriod |
    |academicPeriod2|
    |gradeLevel|
    |gradeLevel2|
    |saveButton|
    Then Success message should be displayed
    And Click on the element in the left Nav
      | EntranceExam  |
      | SetupTwo      |
      | EntranceExam2 |

    When User delete the  "Mesut" from Form
    Then Success message should be displayed