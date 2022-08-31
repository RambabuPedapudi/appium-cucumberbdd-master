
@test
Feature: EoAppLogin scenarios

  Scenario Outline: user register with new email and new password om EoAppLogin
    When I have to click the start button on EO app
    And I enter userValidEmail "<NewUserEmail>"
    And I enter ValidEmailPassword as "<NewEmailPassword>"
    And user agree tearms and conditions
    And I login successfully
    Then I should see EoAppLogin Page "<EoAppTitle>"
    Examples:
      | NewUserEmail        | NewEmailPassword | EoAppTitle      |
      | test@eocharging.com | Password1!       | Charging mode:i |

    Scenario Outline: EoAppLogin with inValid user name and valid password
    When I have to click the start button on EO app
    And I enter userValidEmail "<InvalidUserEmail>"
    And I enter ValidEmailPassword as "<EmailPassword>"
    #And I login successfully
    Then I should see EoAppLogin Page "<EoAppTitle>"
    Examples:
      | InvalidUserEmail                | EmailPassword | EoAppTitle     |
      | invalidUseremail@eocharging.com | Password1!    | Charging mode: |

  Scenario Outline: EoAppLogin with Valid user name and invalid password
    When I have to click the start button on EO app
    And I enter userValidEmail "<validUserEmail>"
    And I enter ValidEmailPassword as "<InvalidPassword>"
    #And I login successfully
    Then I should see EoAppLogin Page "<EoAppTitle>"
    Examples:
      | validUserEmail          | InvalidPassword     | EoAppTitle     |
      | ram.pudi@eocharging.com | Passrewrrewtrword1! | Charging mode: |

  Scenario Outline: EoAppLogin with Valid user name and password
    When I have to click the start button on EO app
    And I enter userValidEmail "<UserEmail>"
    And I enter ValidEmailPassword as "<EmailPassword>"
    #And I login successfully
    Then I should see EoAppLogin Page "<EoAppTitle>"
    Examples:
      | UserEmail               | EmailPassword | EoAppTitle     |
      | ram.pudi@eocharging.com | Password1!    | Charging mode: |

