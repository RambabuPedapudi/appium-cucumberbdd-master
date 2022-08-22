
@test
Feature: EoAppLogin scenarios

  Scenario Outline: EoAppLogin with Valid user name
    When I have to click the start button on EO app
    And I enter userValidEmail "<UserEmail>"
#    And I click the nextbtn for password
    And I enter ValidEmailPassword as "<EmailPassword>"
#    And I click the nextbtn for login
#And user agree tearms and conditions

    #And I login successfully
    Then I should see EoAppLogin Page "<EoAppTitle>"
    Examples:
      | UserEmail               | EmailPassword | EoAppTitle |
      | ram.pudi@eocharging.com | Password1!    | Charging mode:   |