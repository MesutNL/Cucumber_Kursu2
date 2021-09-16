##  Bir önceki Exam Giriş Senaryosunu
##  Aşağıdaki değerler için çalıştırınız.
##
##| ExamName        | AcademicPeriodOption | GradeLevelOption |
##| Math exam is1   | academicPeriod2              | option4  |
##| IT exam is1     | academicPeriod2              | option1  |
##| Oracle exam is1 | academicPeriod2              | option2  |
##| Math exam  is1  | academicPeriod2              | option3  |
Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Entrance Scenario

    And Click on the element in the left Nav
      | EntranceExam  |
      | SetupTwo      |
      | EntranceExam2 |
    And Click on the element in The Dialog
      | addButton |
    When User sending the keys in Dialog Content
      | name | <ExamName> |
    And Click on the element in the Form Content
      | academicPeriod    |
      | <academicPeriod2> |
      | gradeLevel        |
      | <gradeLevel1>     |
      | saveButton        |
    Then Success message should be displayed
    And Click on the element in the left Nav
      | EntranceExam  |
      | SetupTwo      |
      | EntranceExam2 |

    When User delete the  "<ExamName>" from Form
    Then Success message should be displayed

    Examples:
      | ExamName  | academicPeriod2 | gradeLevel1 |
      | Bioexam1  | academicPeriod2 | gradeLevel1     |
      | ITexamen2 | academicPeriod2 | gradeLevel2     |
      | ORacle2   | academicPeriod2 | gradeLevel3     |
      | JAvaExam  | academicPeriod2 | gradeLevel4     |