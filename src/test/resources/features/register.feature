Feature: Register
  As a web user
  I want to use register
  to enter the website

  Scenario Outline: Register in DemoGuru - Mercury Tours
    Given that janinson wants to register on the page
    When he  enters the personal information
      | firstName   | lastName   | phoneNumber   | emailAddress   | username   | password   |
      | <firstName> | <lastName> | <phoneNumber> | <emailAddress> | <username> | <password> |
    Then should see the welcome text in the screen
      | username   | password   |
      | <username> | <password> |
    Examples:
      | firstName | lastName | phoneNumber | emailAddress       | username | password |
      | Janinson  | Hurtado  | 3117942068  | janinson@gmail.com | jani     | hola     |
      | Hamilton  | Urrego   | 31040084714 | urrego@gmail.com   | hami     | mundo    |