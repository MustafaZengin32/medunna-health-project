@Mustafa001
Feature: US001 Registration should be available using SSN, Firstname and Lastname There should be api and DB validation

  @UI @UI001 @NegativeTests
  Scenario Outline: TC00101 There should be a invalid  SSN respecting the without "-" it should be 9 digits long
  TC00105 There should be a invalid SSN respecting the "-" after 3rd and 5th digits it should be 9 digits long with non digit character

    Given MKT user enter the mainpage
    And  MKT user click the top user button
    Then MKT user click the register button
    And  MKT user click SSN textbox
    Then MKT user input  "<invalid SSN>" number in SSN textbox
    And  MKT user click the First Name textbox
    And  MKT verify that "Your SSN is invalid" text appears

    Examples:
      |invalid SSN|
      |123456789|
      |1a3-45-6789 |

  @UI @UI001 @NegativeTests
  Scenario Outline: TC00102 There should be a invalid SSN respecting the "-" after 4th and 6th digits it should be 9 digits long
  TC00103 There should be a invalid SSN respecting the "-" after 3nd digit it should be 9 digits long
  TC00104 There should be a invalid SSN respecting the "-" after 3rd and 5th digits it should be 10 digits long

    Given MKT user enter the mainpage
    And MKT user click the top user button
    Then MKT user click the register button
    And MKT user click SSN textbox
    Then MKT user input  "<invalid SSN>" number in SSN textbox
    And MKT user click the First Name textbox
    And MKT verify that "Your SSN is invalid" text appears

    Examples:
      |invalid SSN|
      |1234-56-789|
      |123-456789 |
      |123-45-67890|


  @UI @UI001 @PositiveTests
  Scenario Outline: TC00106 There should be a valid SSN respecting the "-" after 3rd and 5th digits it should be 9 digits long

    Given MKT user enter the mainpage
    And MKT user click the top user button
    Then MKT user click the register button
    And MKT user click SSN textbox
    Then MKT user input  "<valid SSN>" number in SSN textbox
    And MKT user click the First Name textbox
    And MKT verify that -Your SSN is invalid- text didn't appear

    Examples:
      |valid SSN|
      |123-45-6789|

  @UI @UI001 @NegativeTests
  Scenario Outline: TC00107 There should be a invalid SSN respecting the "-" after 3rd and 5th digits it should be 9 digits long and it should begin 9

    Given MKT user enter the mainpage
    And MKT user click the top user button
    Then MKT user click the register button
    And MKT user click SSN textbox
    Then MKT user input  "<valid SSN>" number in SSN textbox
    And MKT user click the First Name textbox
    And MKT verify that "Your SSN is invalid" text appears

    Examples:
      |valid SSN|
      |923-45-6789|

  @UI @UI001 @NegativeTests
  Scenario: TC00108 SSN cannot be left blank

    Given MKT user enter the mainpage
    And MKT user click the top user button
    Then MKT user click the register button
    And MKT user click SSN textbox
    And MKT user click the First Name textbox
    And MKT verify that "Your SSN is required." text appears


  @UI @UI001 @PositiveTests
  Scenario Outline: TC00109 There should be a valid name that contains any chars

    Given MKT user enter the mainpage
    And MKT user click the top user button
    Then MKT user click the register button
    And MKT user click the First Name textbox
    Then MKT user input  "<First Name>" in firstname textbox
    And MKT user click SSN textbox
    And MKT verify that -Your FirstName is required.- text didn't appear

    Examples:
      |First Name|
      |aliveli|

  @UI @UI001 @NegativeTests
  Scenario: TC00110 First Name textbox should be blank

    Given MKT user enter the mainpage
    And MKT user click the top user button
    Then MKT user click the register button
    And MKT user click the First Name textbox
    And MKT user click SSN textbox
    And MKT verify that -Your FirstName is required.- text appears

  @UI @UI001 @PositiveTests
  Scenario Outline: TC00111 There should be a valid lastName that contains any chars

    Given MKT user enter the mainpage
    And MKT user click the top user button
    Then MKT user click the register button
    And MKT user click the Last Name textbox
    Then MKT user input  "<Last Name>" in lastName textbox
    And MKT user click SSN textbox
    And MKT verify that -Your LastName is required.- text didn't appear

    Examples:
      |Last Name|
      |aliveli|

  @UI @UI001 @NegativeTests
  Scenario: TC00112 Last Name textbox should be blank

    Given MKT user enter the mainpage
    And MKT user click the top user button
    Then MKT user click the register button
    And MKT user click the Last Name textbox
    And MKT user click SSN textbox
    And MKT verify that -Your LastName is required.- text appears

  @Api @API001
  Scenario: TC001_medunna_registration_post_API

    Given send post request to "https://medunna.com/api/register/" to create register
    Then  verifying all


