Feature: Registration in Reqres API

  @Test
  Scenario: Verify when user successfully register
    Given Post register with valid json
    When Send post register user
    Then Status code should be 200 OK
#
#  Scenario Outline: Verify when user unsuccesful register
#    Given Post registration successful
#    When User input <email> and <password>
#    Then Status code should be 400
#
#  Examples:
#    | email              | password |
#    | eve.holt@reqres.in |          |
#    |                    | pistol   |


