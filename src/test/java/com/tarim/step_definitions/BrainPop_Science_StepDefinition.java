package com.tarim.step_definitions;

import com.tarim.pages.BasePage;
import com.tarim.pages.LoginPage;
import com.tarim.pages.Science_page;
import com.tarim.utilities.BrowserUtils;
import com.tarim.utilities.ConfigurationReader;
import com.tarim.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BrainPop_Science_StepDefinition {
LoginPage loginPage=new LoginPage();

    @Given("user should see the brainPop title")
    public void user_should_see_the_brain_pop_title() {

        System.out.println(Driver.getDriver().getTitle());
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.allowAllCookies).click().perform();


    }
    @Given("User able to click science")
    public void user_able_to_click_science() {
       loginPage.Science_manue.click();

    }
    @Given("user should able to see {int} Units in science units page")
    public void user_should_able_to_see_units_in_science_units_page(Integer int1) {
     List<WebElement>unit_containers= Driver.getDriver().findElements(By.xpath("//ul[@id=\"units_section_container\"]//li"));
      for (WebElement eachUnit : unit_containers) {
            String unit_container_names=eachUnit.getText();
          System.out.println(unit_container_names);

      }
Assert.assertTrue(unit_containers.size()==int1);


    }
    @Given("user click on Forces of Nature")
    public void user_click_on_forces_of_nature() {

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.forceOfNature).click().perform();
        BrowserUtils.sleep(3);


       // loginPage.forceOfNature.click();


    }
    @Then("user should able to see {int} topics on Forces of Nature page")
    public void user_should_able_to_see_topics_on_forces_of_nature_page(Integer int1) {
////ul[@id="topics_section_container"]//li
        List<WebElement>topics_Section_Container=Driver.getDriver().findElements(By.xpath("//ul[@id=\"topics_section_container\"]//li"));
        for (WebElement eachTopic : topics_Section_Container) {
            String eachTopicName=eachTopic.getText();
            System.out.println(eachTopicName);
        }
        Assert.assertTrue(topics_Section_Container.size()==int1);

    }
    @Then("user able to click on the topic Tornadoes")
    public void user_able_to_click_on_the_topic_tornadoes() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.tornadoes).click().perform();
        System.out.println(Driver.getDriver().getTitle());

    }
    @Then("user should able to see Tornadoes-BrainPOP as title")
    public void user_should_able_to_see_tornadoes_brain_pop_as_title() {

        System.out.println(Driver.getDriver().getTitle());



    }
    @Then("user should able to click on movie image icon")
    public void user_should_able_to_click_on_movie_image_icon() {
     loginPage.movie_manue.click();
        System.out.println(Driver.getDriver().getTitle());
    }
    @Then("user should able to click on play button")
    public void user_should_able_to_click_on_play_button() {

    }
    @Then("user perform various action with the movie player")
    public void user_perform_various_action_with_the_movie_player() {

    }
    @When("user click on quiz after video")
    public void user_click_on_quiz_after_video() {

    }
    @Then("user able to see Tornadoes Quiz - BrainPOP")
    public void user_able_to_see_tornadoes_quiz_brain_pop() {

    }
}
