package com.macys;

import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.macys.Hooks.test;


public class StepDefination {

   public WebDriver driver;
    public Logger logger;

    public StepDefination(Hooks hk){

        this.driver = hk.webdriver;
        this.logger = hk.logger;
    }


    @Given("^appplicaiton url and valid user name and password$")
    public void appplicaiton_url_and_valid_user_name_and_password() {
        driver.get("https://www.macys.com");
        logger.info("Application is opend successfully ....");
        test.log(LogStatus.PASS,"Browser opend successfully");
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        logger.info("Application is opend successfully and browser maximized ....");

    }

    @When("^Launch the application$")
    public void launch_the_application() {
        System.out.println("Application Launched successfully");

    }


    @When("^Enter the valid user name and password$")
    public void enter_the_valid_user_name_and_password() throws InterruptedException {
        System.out.println("Enter valid user name and password");
        Thread.sleep(Long.parseLong("1000"));
        try {
            WebElement element = driver.findElement(By.xpath(".//*[@id='closeButton']"));
            if (element.isDisplayed()){
                element.click();
                driver.findElement(By.xpath("//*[@id='closeButton']")).click();
                logger.info("Popup closed successfully ");
                driver.findElement(By.xpath(".//input[@id='globalSearchInputField']")).sendKeys("Selenium WebDriver ");
                logger.info("search text is enetered successfully");

            }

        }catch (Exception e){
            System.out.println("The Exception is :"+e.getMessage());
            //

            System.out.println("Test jenkins");
        }
    }

        @Then("^user is able to log into the application$")
        public void userIsAbleToLogIntoTheApplication () throws Throwable {
            System.out.println("User should login to the application ");
            Thread.sleep(Long.parseLong("6000"));

           // driver.quit();
        }
    }

