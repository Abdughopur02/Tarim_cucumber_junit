package com.tarim.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //create a private constructor to remove access to this object

    private Driver(){

    }
    //We make WebDriver private, because we want to close access from outside the class.
    //We are making it static, because we will use it in a static mehtod.
    private static WebDriver driver ;// default value=null
    //Create a re=usable utility method which will return the same driver instance once we call it.
    //If an instance doesn't exist, it will create first, and than it will always return same instance.
    public static WebDriver getDriver(){
        if(driver==null){

            /*
            We will read out browserType from configuration.properties file.
            This way we can control which browser opened from outside our code

             */


            String browserType= ConfigurationReader.getProperty("browser");
            browserType=browserType.trim().toLowerCase();

            //Depending on the browserType returned from the configuration.properties
            //Switch statement will determine the "case" and open the matching browser.
            switch (browserType){
                case "chrome":
                    // WebDriverManager.chromedriver().setup();
                    ChromeOptions options=new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver=new ChromeDriver(options);
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

            }

        }
        return driver;
        /*
        create a new Driver .closeDriver();it will use .quit() method  to quit browsers, and then set the driver value back to null
         */
    }

    public static void closeDriver(){
        if(driver!=null){
            /*
            This line will terminate the currently existing driver completely . it will be non-exist to going forward.
             */
            /*
            We assign the value back to "null" so that my "singleton" can create a newer one if needed.
             */
            driver.quit();
            driver=null;
        }
    }

}
