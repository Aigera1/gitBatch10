package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
       WebElement startPracticing= driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticing.click();
        

    }
}
