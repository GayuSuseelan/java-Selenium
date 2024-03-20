package com.allianz.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://db4free.net");
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();
        ArrayList<String>windows=new ArrayList<String>(driver.getWindowHandles());
        System.out.println(windows);
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.name("pma_username")).sendKeys("Gayathri");
        driver.findElement(By.id("input_password")).sendKeys("admin123");
        driver.close();
        System.out.println(driver.getTitle());
    }
}
