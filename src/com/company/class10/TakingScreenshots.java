package com.company.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenshots {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/Weborders/login.aspx");
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester", Keys.TAB);
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test", Keys.ENTER);

        TakesScreenshot ts=(TakesScreenshot)driver;
       File sourceFile= ts.getScreenshotAs(OutputType.FILE); //the screenshot is taken on this step
        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminLogin.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
