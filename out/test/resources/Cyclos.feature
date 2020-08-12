Feature: CyclosBank login page

  Scenario: The user can login with a valid username and password
    Given user navigates "https://demo.cyclos.org/#login"
    When user enters "demo" to "Login_Name"
    And user enters "1234" to "Password"
    And user clicks "Sign_In"
    Then user views "Welcome_page"

  Scenario Outline: The user cannot login with an invalid username and/or password
    Given user navigates "https://demo.cyclos.org/#login"
    When user enters "<username>" to "Login_Name"
    And user enters "<password>" to "Password"
    And user clicks "Sign_In"
    Then user views ErrorMessage "<errorMessage>"
    Examples:
      | username | password | errorMessage                                                |
      | demo     | 12345    | The given name / password are incorrect. Please, try again. |
      | demooo   | 1234     | The given name / password are incorrect. Please, try again. |
      | demo     |          | Password is required                                        |
      |          | 1234     | Login name is required                                      |
      |          |          | Login name is required\nPassword is required                |


  Scenario: The user drags and drops an item
    Given the user navigates to "https://demos.telerik.com/kendo-ui/dragdrop/index"
    When the user drags the "draggable" to "droptarget"
    Then the user views "You did great!" message

  Scenario: The user performs slider action
    Given the user navigates to "http://demoqa.com/slider"
    When the user slides "range"

  Scenario: User logins Twitter
    Given User navigates "https://twitter.com/login"
    When  User enters "deneme" to "username" area
    And User enters "deneme" to "password" area
    And User clicks "login" area

  Scenario: User goes to Jquery Website
    Given User navigates "https://jqueryui.com/"
    When User clicks "demos" area
    And User clicks "draggable" area
#    Then User drags "drag_me_around"
