Feature: Add Student Functionality


  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Add employees Scenario
    And Click on the element in the left Nav
      | humanResources |
      | Employees      |
    And Click on the element in The Dialog
      | addButton |

    When User sending the keys in Form Content
      | firstName      | <Name>  |
      | lastName       | Erbay   |
      | employeeId     | 2342323 |
      | documentNumber | 233     |

    And Click on the element in the Form Content
#      | gender          |
#      | male            |
      | documentType    |
      | passport        |
      | employeeType    |
      | employeeTeacher |
      | saveButton      |
    Then Success message should be displayed

    And Click on the element in the left Nav
      | humanResources |
      | Employees      |
    And User delete the "<Name>" employee
    Then Success message should be displayed

    Examples:
      | Name  |
      | Mesut |
