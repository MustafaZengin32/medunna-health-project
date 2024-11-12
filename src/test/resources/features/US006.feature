@Mustafa006
Feature: US006 User info segment (User Settings) should be editable on Homepage

  @UI
  Scenario Outline: TC00601 There should be user firstname textbox to update
    Given MKT user enter the mainpage
    And  MKT user click the left top user sign in button
    Then MKT user inputs his or her "<us06Username>" to username
    And  MKT user inputs his or her "<us06Password>" to password
    And  MKT user click the Sign in button
    And  MKT user click the top left the button that have same name with username
    And  MKT user click settings at dropdown window
    And  MKT user click firstname textbox
    And  MKT user clear firstname textbox
    And  MKT user input "<us06NewFirstName>" in firstname textbox
    And  MKT user clicks save button
    And  MKT user click the top left the button that have same name with username
    And  MKT user click signout button in dropdown page
    And  MKT user click the left top user sign in button
    Then MKT user inputs his or her "<us06Username>" to username
    And  MKT user inputs his or her "<us06Password>" to password
    And  MKT user click the Sign in button
    And  MKT user click the top left the button that have same name with username
    And  MKT user click settings at dropdown window
    And  MKT verify firstname textbox has "<us06NewFirstName>" value
    Examples: User Credentials
      | us06Username | us06Password | us06NewFirstName |
      | candy        | User.123     | coni             |

