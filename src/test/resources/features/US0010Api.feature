
Feature: US010_ApiTest
  @Mustafa0010Api
  Scenario Outline: doctor should be able to see his/her appointment list in api
    When Doctor set Medunna base url with id <id>
    And  Doctor send the GET request and GET the response
    And  Doctor deserialize data json to java
    And  Doctor saves the appointment data to correspondent files
    And  Doctor validates expected data with API <patientId>, "<startDate>","<endDate>","<status>"
    Examples:
      | id    | patientId | startDate             | endDate              | status     |
      | 20470 | 5993      | 2023-03-14T00:00:00Z  | 2023-03-14T01:00:00Z | UNAPPROVED |
      | 20471 | 5993      | 20S23-03-14T00:00:00Z | 2023-03-14T01:00:00Z | UNAPPROVED |