package com.tarim.step_definitions;

import com.tarim.pages.GoogleSearchPage;
import com.tarim.utilities.BrowserUtils;
import com.tarim.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class GoogleSearchStepDefinition {
GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Google";

        Assert.assertEquals(actualTitle,expectedTitle);



    }

    @When("user searches for apple")
    public void userSearchesForApple() {

        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("user should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {

        BrowserUtils.verifyTitle("apple - Google Search");

        Driver.closeDriver();
    }

}
