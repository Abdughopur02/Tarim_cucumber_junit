package com.tarim.pages;

import com.tarim.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Science_page {

    public Science_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class=\"unit-container\"]")
    public WebElement Unit_container;
    @FindBy(xpath = "")
    public WebElement xxxxx;
}
