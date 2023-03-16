Feature: Verify Login functionality on Trst health application

  Scenario Outline: Verify login functionality for valid credentials
    Given user opens browser and navigates to "https://qa.trsthealth.com/" url
    When user entered <username> in username field and <password> in password field
    And Clicked on login button
    Then User should be logged in and dashboard page should be displayed
    Examples:
      | username       | password     |
      | "ranjit_admin" | "Ranjit@123" |

