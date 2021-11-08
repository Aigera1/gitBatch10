package com.company.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title=driver.getTitle();
        if(title.equals("Facebook - Log In or Sign Up")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is wrong");
        }


         driver.quit();
    }
}
