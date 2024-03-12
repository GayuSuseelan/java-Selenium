package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DemoCityBank {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
        S
        driver.findElement(By.xpath("//a[@class='sbSelector']")).click();
        driver.findElement(By.xpath("//a[@rel='Credit Card']")).click();


    }
}
