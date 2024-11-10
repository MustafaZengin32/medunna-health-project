@Mustafa004

Feature: Login page should accessible only with valid credentials

  @UI @UI004 @login
  Scenario Outline: Verifying user login with correct username and password

    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When  C Click on Account DropDownMenu button
    When  C Click on Sign in
    Then  C Click on Username input box.
    Then  C Enter Valid "<username>" Username
    Then  C Click on Password input box.
    Then  C Enter Valid "<password>" Password
    Then  C Click on Sign in button
    And   Verify that Sign Out  is displayed
    Examples:
      | username    | password |
      | AdminTeam01 | Team01+  |

