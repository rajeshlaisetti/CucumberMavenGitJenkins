package com.macys;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Hooks  {

    public WebDriver webdriver=null;
    Scenario scenario ;
    public String browser = "Chrome";
    //To generate Extent report
    public static ExtentReports extent;
    public static ExtentTest test;
    public  Logger logger;

    @Before
    public void initializationingTest(Scenario scenario) throws InterruptedException {

        this.scenario=scenario;
        System.out.println("The Name of the Scenario is : "+scenario.getName());
        System.out.println("The Description of the Scenario is : "+scenario.getStatus());

        logger=Logger.getLogger(scenario.getName());

        // configure log4j properties file
        PropertyConfigurator.configure("Log4j.properties");


        // report folder and file creation
        String currentDate = new SimpleDateFormat("MM dd HH:mm:ss").format(new Date());
        String MyOwnReport = "ExtentReport_"+currentDate.replaceAll("\\s+","").replaceAll(":","-").trim()+".html";
        File myExtentReportFile = new File(MyOwnReport);
        System.out.println(myExtentReportFile);
        //Object creation of extent report
        extent = new ExtentReports(System.getProperty("user.dir") +"/Extent-Reports/"+myExtentReportFile, true);


        String OsVersion = System.getProperty("os.version");
        String UserHomeDirectory = System.getProperty("user.home");


        extent.addSystemInfo("Os Version ", OsVersion);
        try {
            extent.addSystemInfo("IP Address ",  InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        extent.addSystemInfo("User home directory ",UserHomeDirectory );
        extent.addSystemInfo("Application", "Macy's Marketing Application");
        extent.addSystemInfo("Tool","Selenium WebDriver");
        extent.addSystemInfo("Executed On Browser ",browser);




        System.out.println("browser has been inisiated successfully and running...");
        test=extent.startTest("browser has been inisiated successfully and running...");
        if(browser.equalsIgnoreCase("firefox")){
            System.out.println("Browser Setup and Lauch...");
            webdriver = new FirefoxDriver();
            test.log(LogStatus.PASS, "Firefox Brower has been inisilized successfully..");
        }else if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
            webdriver = new ChromeDriver();
            logger.info("Browser Opened");
            test.log(LogStatus.PASS, "Chrome Brower has been inisilized successfully..");
        }else if(browser.equalsIgnoreCase("Iexplore")){
            System.setProperty("webdriver.ie.driver", "D:\\Tours\\Jars\\IEDriverServer.exe");
            webdriver = new InternetExplorerDriver();
            test.log(LogStatus.PASS, "Iexplorer Brower has been inisilized successfully..");
        }
        webdriver.manage().window().maximize();
        test.log(LogStatus.INFO,"Browser Maximized ");
        Thread.sleep(1000);



    }

    @After
    public void teardownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            /*try {
                byte[] screenshot = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.BYTES);
                String testName = scenario.getName();
                scenario.embed(screenshot, "image/png");
                scenario.write(testName);
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }*/
            try {
                String screenShotPath = CaptureScreenshot.capture(webdriver, scenario.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        System.out.println("Successfully Closed all browser instancess ,..");
        webdriver.quit();
        logger.info("Browser closed ...");
        test.log(LogStatus.PASS,"Browser Closed Successfully ");
        extent.endTest(test);


        //Flushing and Closing
        extent.flush();
        extent.close();

    }


}
