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
        driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Allianz");
        Select usertitle=new Select(driver.findElement(By.xpath("//select[@name='UserTitle']")));
        usertitle.selectByVisibleText("IT Manager");
        Select Employees=new Select(driver.findElement(By.xpath("//select[@name='CompanyEmployees']")));
        Employees.selectByVisibleText("101 - 200 employees");
        driver.findElement(By.name("UserLastName")).click();
        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
        Select country=new Select(driver.findElement(By.xpath("//select[@name='CompanyCountry']")));
        country.selectByVisibleText("United Kingdom");
        driver.findElement(By.xpath("//button[@name='start my free trial']")).click();
        //driver.quit();






    }
}