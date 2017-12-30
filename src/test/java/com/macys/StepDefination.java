package com.macys;

import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.macys.Hooks.test;


public class StepDefination {

   public WebDriver driver;

    public StepDefination(Hooks hk){
        this.driver = hk.webdriver;
    }


    @Given("^appplicaiton url and valid user name and password$")
    public void appplicaiton_url_and_valid_user_name_and_password() {
        driver.get("https://www.macys.com");
        test.log(LogStatus.PASS,"Browser opend successfully");
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("^Launch the application$")
    public void launch_the_application() {
        System.out.println("Application Launched successfully");

    }


    @When("^Enter the valid user name and password$")
    public void enter_the_valid_user_name_and_password() throws InterruptedException {
        System.out.println("Enter valid user name and password");
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.xpath(".//div[@id='tinyconten']//a[@id=\"closeButton\"]")).click();
        driver.findElement(By.xpath(".//input[@id='globalSearchInputField']")).sendKeys("Selenium WebDriver ");

    }
    @Then("^user is able to log into the application$")
    public void user_is_able_to_log_into_the_application() throws InterruptedException {
        System.out.println("User should login to the application ");
        Thread.sleep(Long.parseLong("1000"));
        driver.quit();
    }



}
