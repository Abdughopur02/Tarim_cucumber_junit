Feature: BrianPop Functionalities
Agile Story: As a user, I should be able to access all the features
 Background: user already sign in
  Given user is on the login page
  When  user click login button to select  dropDown menu
  Then  user select dropDown accordingly
  When  user enter valid username
  Then  user enter valid password
  When  user clicks on the login button
@wip02
 Scenario: BrainPop Science page features
  Given user should see the brainPop title
  And  User able to click science
  And user should able to see 16 Units in science units page
  And user click on Forces of Nature
  Then user should able to see 19 topics on Forces of Nature page
  Then user able to click on the topic Tornadoes
  And user should able to see "Tornadoes-BrainPOP" as title
  Then user should able to click on movie image icon
  Then user should able to click on play button
  And user perform various action with the movie player
  When user click on quiz after video
  Then user able to see Tornadoes Quiz - BrainPOP

