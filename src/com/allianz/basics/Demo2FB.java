package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String actualTile=driver.getTitle();
        System.out.println(actualTile);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
    }
}
