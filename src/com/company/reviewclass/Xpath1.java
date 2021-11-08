package com.company.reviewclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Xpath1 {

    public  static String url="https://syntaxprojects.com/table-search-filter-demo.php";
    public static void main(String[] args) {
        //setUpWithSpecificUrl(URL);
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



    }
}
