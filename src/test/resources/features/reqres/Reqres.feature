Feature: Reqres API Automation Testing QA-10
  @Latihan
  Scenario Outline: Get list user with valid parameter page
    Given Get list user with valid paramter page <page>
    When Send get list users
    Then Status code should be 200 OK

    Examples:
      | page |
      | 1    |
      | 1    |
    @Latihan
    Scenario: Post create new user with valid json
      Given Post create user with valid json
      When Send post create user
      Then Status code should be 201 Created