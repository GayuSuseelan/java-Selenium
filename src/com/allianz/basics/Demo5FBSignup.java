package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo5FBSignup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Wick");
        driver.findElement(By.id("password_step_input")).sendKeys("password123");
        driver.findElement(By.xpath("//input[@value='-1']")).click();
        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByVisibleText("14");
        Select selectMonth=new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("4");
        Select selectYear=new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("1970");
        //driver.findElement(driver.)
    }
}
