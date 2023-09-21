package com.tarim.step_definitions;

import com.tarim.pages.LoginPage;
import com.tarim.utilities.BrowserUtils;
import com.tarim.utilities.ConfigurationReader;
import com.tarim.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BrainPop_StepDefinition {
LoginPage loginPage=new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlBrainPop"));

    }
    @When("user click login button to select  dropDown menu")
    public void user_click_login_button_to_select_drop_down_menu() {
        loginPage.loginDropDownButton.click();

    }
    @Then("user select dropDown accordingly")
    public void user_select_drop_down_accordingly() {
        loginPage.dropDownButton.click();

    }
    @When("user enter valid username")
    public void user_enter_valid_username() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));

    }
    @Then("user enter valid password")
    public void user_enter_valid_password() {
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("password"));

    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.logInButton.click();

    }
    @Then("user should see BrainPOP in the title")
    public void user_should_see_brain_pop_in_the_title() {
        String expectedTitle="BrainPOP";

        BrowserUtils.waitForTitleContains(expectedTitle);
        BrowserUtils.verifyTitleContains(expectedTitle);


    }


    @When("user Enter {string} query and submit")
    public void user_enter_query_and_submit(String input) {
      loginPage.searchBox.sendKeys(input + Keys.ENTER);





    }

    @Then("there are {int} topic with challenge are displayed")
    public void thereAreTopicWithChallengeAreDisplayed(int arg0) {
        List<WebElement> topicsLink= Driver.getDriver().findElements(By.xpath("//div[2]/div[3]/div[3]/div[3]/div/ul/li"));
        //  List<WebElement> topicsLink= Driver.getDriver().findElements(By.tagName("div"));

        for (WebElement element : topicsLink) {

            String topicsText = element.getText();
            System.out.println(topicsText);



        }
        System.out.println(topicsLink.size());
        Assert.assertTrue(topicsLink.size()==arg0);




    }
    @Then("user select topic {string} from the search results page")
    public void user_select_topic_from_the_search_results_page(String string) {
      Actions actions=new Actions(Driver.getDriver());
      actions.moveToElement(loginPage.topic_DNA).click().perform();






    }
    @When("user perform various actions with the movie player")
    public void user_perform_various_actions_with_the_movie_player() {
    loginPage.movie.click();
   loginPage.play.click();
    loginPage.closedCaption.click();//subtitle
        //Actions actions=new Actions(Driver.getDriver());
       // actions.dragAndDrop(loginPage.videoSlider01,loginPage.videoSlider ).perform();
      WebElement videoSlider=Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div/input"));
        for (int i = 1; i <=38 ; i++) {
            videoSlider.sendKeys(Keys.ARROW_RIGHT);
        }
    //loginPage.videoSlider.click();
        List<WebElement>features=Driver.getDriver().findElements(By.xpath("//div[1]/div/div/div/div/div/div/div/div/main/div[3]/ul/li"));
        for (WebElement feature : features) {
            String featureTopics= feature.getText();
            System.out.println(featureTopics);



        }
        System.out.println(features.size());
    }
    @Then("user select feature associated with the topic")
    public void user_select_feature_associated_with_the_topic() {

         //loginPage.readingFeature.click();
        //loginPage.quizFeature.click();
        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(loginPage.readingFeature).click().perform();
        // actions.click(loginPage.readingFeature).perform();

    }





}
