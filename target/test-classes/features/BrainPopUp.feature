Feature: User Navigate to BrainPOP Home page validate number of topics returned matches the amount of topics reported
  in DNA topics
@wip
  Scenario: User Navigate to BrainPOP home page
    When user click login button to select the dropDown menu
    Then user select "I'm a grown-up" button
    Then enter the username
    Then enter the password
    Then user click log in button