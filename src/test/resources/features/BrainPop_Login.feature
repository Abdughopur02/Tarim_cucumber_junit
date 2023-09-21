Feature: BrainPOP login functionalities

  Agile Story: As a user, I should be able to access all the features
# Windows(make each line is perfect line up)-->control+alt+l
  @Abu
  Scenario: BrainPOP login verification with valid credentials
    Given user is on the login page
    When  user click login button to select  dropDown menu
    Then  user select dropDown accordingly
    When  user enter valid username
    Then  user enter valid password
    When  user clicks on the login button
    Then  user should see BrainPOP in the title
    When user Enter "Challenge" query and submit
    Then there are 464 topic with challenge are displayed
    Then  user select topic "DNA" from the search results page
    When user perform various actions with the movie player
    Then user select feature associated with the topic

