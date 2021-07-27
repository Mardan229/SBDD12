Feature: This feature file is for CitiBankSignOn feature file.

  Scenario: Verify  customer SignOn
    Given Customer in SignOn page
    When Customer gives userId input " computer"
    And Customer givers password input "internet"
    And Customer click the submit button
    Then CustThen should be able to Signon

  Scenario Outline: Verify CitiBank customer Login using wrong userid and with wrong password
    Given Customer in citiBank SignOn page
    When Customer gives userid input " UserID"
    And Customer givers password input "password"
    And Customer click Remember UserId  button
    And Customer click the submit button
    Then CustThen should be able to SignOn

    Examples: 
      | UserID | Password |
      | Hello  | World    |
      | Robin  | Hood     |
