package com.macys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class StepDefination {

    WebDriver driver;

    @Given("^appplicaiton url and valid user name and password$")
    public void appplicaiton_url_and_valid_user_name_and_password()  {
        System.out.println( "Enter valid Portal and user name and password");
        System.setProperty("webdriver.chrome.driver", "D:\\Cucumber-Jar-Files\\chromedriver_win32\\new\\chromedriver.exe");
        //System.setProperty("webdriver.ie.driver", "D:\\Cucumber-Jar-Files\\IEDriverServer\\IEDriverServer.exe");
        //driver= new InternetExplorerDriver();


        driver = new ChromeDriver();
        driver.get("https://www.macys.com");
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("^Launch the application$")
    public void launch_the_application()  {
        System.out.println("Application Launched successfully");
       // Assert.assertTrue(driver.getTitle().contains("flipkart"));
    }

    @When("^Enter the valid user name and password$")
    public void enter_the_valid_user_name_and_password() throws InterruptedException {
        System.out.println("Enter valid user name and password");
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.xpath(".//div[@id='tinycontent']//a[@id=\"closeButton\"]")).click();
        driver.findElement(By.xpath(".//input[@id='globalSearchInputField']")).sendKeys("Selenium WebDriver ");

    }

    @Then("^user is able to log into the application$")
    public void user_is_able_to_log_into_the_application() throws InterruptedException {
        System.out.println("User should login to the application ");
        Thread.sleep(Long.parseLong("1000"));
        driver.quit();
    }


}
