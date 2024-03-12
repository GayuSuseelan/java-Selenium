package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4FLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
       // driver.findElement(By.xpath("//input[@id='email']"))
        driver.findElement(By.id("email")).sendKeys("yz@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("gaya2");
        driver.findElement(By.name("login")).click();

    }
}
