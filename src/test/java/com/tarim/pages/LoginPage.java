package com.tarim.pages;

import com.tarim.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);



    }
    @FindBy(xpath = "//div[.=\"Log In\"]")
    public WebElement loginDropDownButton;
    @FindBy(xpath = "//span[.=\"I'm a grown-up\"]")
    public WebElement dropDownButton;
    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id="password-input")
    public WebElement passWord;
    @FindBy(id="login_button")
    public WebElement logInButton;
    @FindBy(xpath = "//div[.=\"Allow all cookies\"]")
    public WebElement allowAllCookies;
    @FindBy(xpath = "//title[.=\"BrainPOP\"]")
    public WebElement title;
    @FindBy(xpath="(//div[@class=\"card-body\"])[12]")
    public WebElement Science_manue;
    @FindBy(xpath="(//ul[@id=\"units_section_container\"]//li)[8]")
    public WebElement forceOfNature;
    @FindBy(xpath = "(//ul[@id=\"topics_section_container\"]//li)[13]")
    public WebElement tornadoes;
    @FindBy(xpath = "(//ul[@class=\"layout-3 desktop features-container-ul\"]//li)[1]")
    public WebElement movie;
    @FindBy(xpath = "//input[@placeholder=\"Search BrainPOP\"]")
    public WebElement searchBox;
    @FindBy(xpath = "/span[@class=\"topics_results_number\"]")
    public WebElement topicResultNumber;
    @FindBy(xpath = "//div[@class=\"topic_name\"]")
    public WebElement AwrinkleInTime_Topic;

    @FindBy(xpath = "//*[@id=\"topic_result_144\"]")
    public WebElement topic_DNA;
    @FindBy(xpath = "//div[1]/div/div/div/div/div[3]/div/div/main/div[4]/div/div/div/div[2]/div/ul/li[1]/a/div/div[2]/div")
    public WebElement movie_manue;
    @FindBy(xpath = "//div[1]/div/div/div/div/div/div/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/button[1]")
    public WebElement play;

    @FindBy(xpath = "//div[1]/div/div/div/div/div/div/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/time[1]")
    public WebElement videoSlider01;
    @FindBy(xpath = "//div[1]/div/div/div/div/div/div/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/time[2]")
    public WebElement videoSlider;
    @FindBy(xpath = "//span[.=\"Closed Captions\"]")
    public WebElement closedCaption;
    //div[1]/div/div/div/div/div/div/div/div/main/div[3]/ul/li[7]/a
//div[1]/div/div/div/div/div/div/div/div/main/div[3]/ul/li[7]/a/div
//div[1]/div/div/div/div/div/div/div/div/main/div[3]/ul/li[7]/a/div/div[1]
//*[@class="link feature_link"]
    @FindBy(xpath = "//div[1]/div/div/div/div/div/div/div/div/main/div[3]/ul/li[7]/a/div")
    public WebElement readingFeature;


    public void login(String username,String password){
        this.userName.sendKeys(username);
        this.passWord.sendKeys(password);
        this.logInButton.click();
    }
    public void action(){
        Actions actions=new Actions(Driver.getDriver());

    }

}
