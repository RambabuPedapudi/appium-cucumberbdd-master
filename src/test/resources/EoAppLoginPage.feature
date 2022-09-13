
@test
Feature: EoAppLogin scenarios

  Scenario Outline: user register with new email and new password om EoAppLogin
    When I have to click the start button on EO app
    And I enter userValidEmail "<NewUserEmail>"
    And I enter ValidEmailPassword as "<NewEmailPassword>"

    And user agree tearms and conditions
    And I login successfully
    Then I should see EoAppWelcomeLogin Page Title "<EoAppWelcomeTitle>"
  #Link the fake charger
    # When I  should see EoAppLogin Page "<EoAppTitle>"
    And I click the home button
    And click the manual button
    And enter the serial number as "<ChargerSerialNumber>"
    And click the manual button
    And enter the verification code as "<VerificationCode>"
    And able to see Bluetooth manual button and click the skip button.
    And enter the surname as "<surname>" and firstmane as "<firstname>"
    And enter address as"<address>"
    Then I should see EoAppLogin Page "<EoAppTitle>"

    Examples:
      | NewUserEmail        | NewEmailPassword | EoAppWelcomeTitle | ChargerSerialNumber | VerificationCode | surname | firstname | address                           | EoAppTitle |
      | test@eocharging.com | Password1!       | Welcome to EO     | RamFakeCharger      | 123123           | ram     | pudi      | 29, Thornton Road, Ilford,IG1 2ER | Charging mode: |

  Scenario Outline:User Login with InValidEmail address
    When I have to click the start button on EO app
    And I enter userInValidEmail "<InvalidUserEmail>"
    Then I should Expect EoErrorMessage on AppPage "<EoErrorMessage>"
    Examples:
      | InvalidUserEmail                                                                                                                                                                                                                                                                      | EoErrorMessage |
      | test123                                                                                                                                                                                                                                                                               | Charging mode: |
      | test123@                                                                                                                                                                                                                                                                              | Charging mode: |
      | 400                                                                                                                                                                                                                                                                                   | Charging mode: |
      | MoreThanThreeTwentyCharactersShouldFailedThatlimitisamaximumof64charactersinthelocalpart@gmail.com                                                                                                                                                                                    | Charging mode: |
      | Error@MoreThanThreeTwentyCharactersShouldFailedThatlimitisamaximumof255charactersAfterTheDOmainMoreThanThreeTwentyCharactersShouldFailedThatlimitisamaximumof255charactersAfterTheDOmainMoreThanThreeTwentyCharactersShouldFailedThatlimitisamaximumof255charactersAfterTheDOmain.com | Charging mode: |
      | 1@yahoo.com                                                                                                                                                                                                                                                                           | Charging mode: |


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

