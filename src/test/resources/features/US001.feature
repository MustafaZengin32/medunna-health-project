Feature: US001 Registration should be available using SSN, Firstname and Lastname There should be api and DB validation

  @US001
  Scenario Outline:TC00101 There should be a invalid  SSN respecting the without "-" it should be 9 digits long

    Given MKT user enter the mainpage
    And   MKT user click the top user button
    Then  MKT user click the register button
    And   MKT user click SSN textbox
    Then  MKT user input  "<invalid SSN>" number in SSN textbox
    And   MKT user click the First Name textbox
    And   MKT verify that "Your SSN is invalid" text appears

    Examples:
      | invalid SSN |
      | 123456789   |
      | 1a3-45-6789 |






