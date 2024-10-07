Feature: US001 Registration should be available using SSN, Firstname and Lastname There should be api and DB validation

  @UIRegistration @NegativeTestsUI
  Scenario Outline: TC00101 There should be a invalid  SSN respecting the without "-" it should be 9 digits long
                    TC00102 There should be a invalid SSN respecting the "-" after 3rd and 5th digits it should be 9 digits long with non digit character

    Given MKT user enter the mainpage
    And   MKT user click the top user button
    Then  MKT user click the register button
    And   MKT user click SSN textbox
    Then  MKT user input  "<invalid SSN>" number in SSN textbox
    And   MKT user click the First Name textbox
    And   MKT verify that "Your SSN is invalid" text appears

    Examples:
      |invalid SSN|
      |123456789|
      |1a3-45-6789 |



  @UIRegistration @PositiveTestsUI
  Scenario Outline: TC00103 There should be a valid SSN respecting the "-" after 3rd and 5th digits it should be 9 digits long

    Given MKT user enter the mainpage
    And   MKT user click the top user button
    Then  MKT user click the register button
    And   MKT user click SSN textbox
    Then  MKT user input  "<valid SSN>" number in SSN textbox
    And   MKT user click the First Name textbox
    And   MKT verify that -Your SSN is invalid- text didn't appear

    Examples:
      |valid SSN|
      |123-45-6789|

  @ApiUS01
  Scenario: TC00104 Create registrants using api and validate

    Given MKT User set the path params for register
    And   MKT user enters expected data for register
    And   MKT user sends request and receives response for register
    Then  MKT user save all API information for register
    Then  MKT user verify API records for register


  @DbUS01
  Scenario Outline: TC00105 Validate registrant SSN ids with DB

    Given MKT user creates a connection with db
    And   MKT user sends the query to db and gets the user data with ssn number "<ssn>"
    Then  MKT validates db registrant data  "<ssn>"

    Examples: test data
      | ssn         |
      | 856-45-6789 |














