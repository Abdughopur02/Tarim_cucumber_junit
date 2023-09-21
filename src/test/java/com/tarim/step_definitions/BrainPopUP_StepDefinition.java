package com.tarim.step_definitions;

import com.tarim.pages.LogIn_page02;
import com.tarim.utilities.BrowserUtils;
import com.tarim.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrainPopUP_StepDefinition {

    LogIn_page02 logIn_page=new LogIn_page02();

    @When("user click login button to select the dropDown menu")
    public void user_click_login_button_to_select_the_drop_down_menu() {
        Driver.getDriver().get("https://www.brainpop.com/");
        logIn_page.logInSelectButton.click();
        logIn_page.dropDownButton.click();
        BrowserUtils.sleep(3);
        logIn_page.userName.sendKeys("qatest2023");
        logIn_page.passWord.sendKeys("brainp0p");
        logIn_page.logInButton.click();
    }
    @Then("user select {string} button")
    public void user_select_button(String string) {

    }
    @Then("enter the username")
    public void enter_the_username() {

    }
    @Then("enter the password")
    public void enter_the_password() {

    }
    @Then("user click log in button")
    public void user_click_log_in_button() {

    }
}
