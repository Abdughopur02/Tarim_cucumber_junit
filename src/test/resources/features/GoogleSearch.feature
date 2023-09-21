Feature: Google search functionality
 Agile story: AS a user, when I am on the Google search page I should be able to
 search anything and see relevant result;

 Scenario: Search page default title verification
   When user is on the Google search page
   Then user should see title is Google

   @wip
   Scenario: Search result title verification
     Given user is on the Google search page
     When user searches for apple
     Then user should see apple in the title
