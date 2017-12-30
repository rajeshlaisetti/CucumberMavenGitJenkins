package com.macys;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

class CaptureScreenshot {

    public static String capture(WebDriver driver,String screenShotName) throws IOException
    {
        String ScreenShotDate = new SimpleDateFormat("MM dd HH:mm:ss").format(new Date());
        String screenShot = screenShotName+"_"+ScreenShotDate.replaceAll("\\s+","").replaceAll(":","-").trim()+".png";
        File newScreenShot = new File(screenShot);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+newScreenShot;
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);

        return dest;
    }

}
