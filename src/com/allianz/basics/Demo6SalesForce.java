package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo6SalesForce {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
        driver.findElement(By.name("UserFirstName")).sendKeys("John");
        driver.findElement(By.name("UserLastName")).sendKeys("Wick");
        //driver.findElement(By.name("CompanyCountry")).sendKeys("United Kingdom");
        driver.findElement(By.name("UserEmail")).sendKeys("johnwick@gmail.com");
        driver.findElement(By.name("UserTitle")).sendKeys("IT Manager");
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Allianz");
        driver.findElement(By.name("CompanyEmployees")).sendKeys("101-200 Employees");
        driver.findElement(By.xpath("//div[@class='checkbox-ui'][2]")).click();
        //driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
        //driver.findElement(By.id("rejectInvite")).click();
        //driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
        driver.findElement(By.name("start my free trial")).click();






    }
}