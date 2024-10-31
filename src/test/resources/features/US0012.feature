
@US_012_smoke_test
Feature: US_012 My Appointments Edit portal by Physician(Doctor)

  Scenario:Sign in Medunna
    Given user is on the home page :  "https://medunna.com"
    When  user clicks on user icon
    Then  user clicks on Sign In Button
    And   user enters valid username "doctorJames" in username input
    And   user enters valid password "James1234." in password input
    And   user clicks on Remember Me checkbox
    And   user clicks on Sign In submit Button
    And   user clicks on My Pages
    And   user clicks on My Appointments
    And   user clicks on Edit button
    Then user verifies Create or Edit an Appointment text is visible
    Then user verifies patient id is visible
    Then user verifies start date is visible
    Then user verifies end date is visible
    Then user verifies status is visible
    Then user verifies physician is visible
    Then user closes the page

