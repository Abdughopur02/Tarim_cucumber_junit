package com.tarim.pages;

import com.tarim.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_page02 {

public LogIn_page02(){
    PageFactory.initElements(Driver.getDriver(),this);

}
    @FindBy(xpath = "//div[.=\"Log In\"]")
    public WebElement logInSelectButton;
    @FindBy(xpath = "//span[.=\"I'm a grown-up\"]")
     public WebElement dropDownButton;
    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id="password-input")
    public WebElement passWord;
    @FindBy(id="login_button")
    public WebElement logInButton;


}
