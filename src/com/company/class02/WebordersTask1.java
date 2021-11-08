package com.company.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebordersTask1 {
    public static void main(String[] args) throws InterruptedException {
        //Navigate http://secure.smartbearsoftware.com/samples/testcomplete11/Weborders/login.aspx
        // login
        //get title and verify
        //close the browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/Weborders/login.aspx");
        driver.manage().window().maximize();
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password=driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");
        WebElement login=driver.findElement(By.className("button"));
        login.click();
        String title=driver.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is wrong");
        }
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
