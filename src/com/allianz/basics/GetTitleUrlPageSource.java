package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitleUrlPageSource {
    public static void main(String[] args) {
        WebDriver driver=null;
        String browser="edge";
        if (browser.equalsIgnoreCase("ch")){
            driver=new ChromeDriver();
        }
        else{
            driver=new EdgeDriver();
        }
        WebDriver driver1=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String actualTile=driver.getTitle();
        System.out.println(actualTile);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
        driver1.get("https://www.google.co.in/");
    }
}
