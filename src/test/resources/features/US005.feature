@Mustafa005

Feature: US005 : New customers (patients) should make an appoinment
  to processed in hospital

  @US005positive
  Scenario Outline: Test03: Make an Appointment - Verify Phone and Date
  TC00506 - TC00507 - TC00508 - TC00509
    Given MB Launch web browser and navigate to the home page
    And   MB Click the Make an Appointment button
    And   MB Click First Name textbox and Enter First Name "<mfirstname>"
    And   MB Click the Last Name textbox and enter Last Name "<mlastname>"
    And   MB Click the SSN textbox and enter SSN number "<mssn>"
    And   MB Click Email textbox and enter a valid Email address "<memail>"
    And   MB Click the Phone textbox and enter a valid Phone number "<mphone>"
    Then  MB Verify that this Phone textbox is not blank
    Then  MB Verify that user is using digits for Phone textbox
    And   MB Click Send An Appointment Request button and verify appointment success message which contains Registration saved

    Examples:
      | mfirstname | mlastname | mssn        | memail                | mphone       |
      | Emel       | Sahin     | 567-83-3334 | dharmasahin@gmail.com | 514-888-6538 |


