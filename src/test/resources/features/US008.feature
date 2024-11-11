@Mustafa008
Feature: User should be able to see the new password changed


  Scenario Outline:
    Given FY User navigates to Medunna home page
    And FY User clicks on human icon
    And FY User clicks on sign in button under human icon at homepage1
    And FY User sends username "<username>" and password "<password>" in sign in page
    And FY User clicks on sign in button in sign in page
    And FY User clicks on human icon account menu in userPage
    And FY User clicks on password button in dropdown menu
    And FY User sends his current password "<password>" to current password part
    And FY User sends his new password "<newPassword>" to new password part
    And FY User validates the password strength "<passwordStrength>"
    And FY User sends his confirmation password "<confirmationPassword>" to confirmation password part
    And FY User clicks on the save button in password page
    And FY User validates toast container success message
    Then FY User clicks on Sign out button

    Examples: User credentials
      | username     | password | newPassword | confirmationPassword | passwordStrength |
      | fatihmustafa | Batch44+ | qwertyu     | qwertyu              | 1                |
      | fatihmustafa | qwertyu  | 123456+     | 123456+              | 2                |
      | fatihmustafa | 123456+  | Batch44+    | Batch44+             | 5                |
      | stafffatih   | Batch44+ | 123456a     | 123456a              | 2                |

