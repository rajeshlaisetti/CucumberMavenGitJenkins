package com.macys;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks  {

    public WebDriver webdriver=null;

    Scenario scenario ;
    @Before
    public void initializationingTest(Scenario scenario){

        this.scenario=scenario;

        System.out.println("The Name of the Scenario is : "+scenario.getName());
        System.out.println("The Description of the Scenario is : "+scenario.getStatus());

        System.setProperty("webdriver.chrome.driver", "D:\\Cucumber-Jar-Files\\chromedriver_win32\\chromedriver.exe");
        webdriver = new ChromeDriver();

    }

    @After
    public void teardownTest(Scenario scenario){
        if(scenario.isFailed())
           {
               try {
                   scenario.embed(((TakesScreenshot)webdriver).getScreenshotAs(OutputType.BYTES),"image\\png");
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
            System.out.println("Close all the browser and test...");
            webdriver.quit();


    }

}
