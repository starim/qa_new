package com.trello.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrelloTestClass {
    WebDriver wd;


    @BeforeMethod
    public void setUp() {

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://trello.com");

    }

    @Test
    public void loginTest() {
        wd.findElement(By.cssSelector("[href='/login']")).click();
        wd.findElement(By.id("user")).sendKeys("sergejserobaba@gmail.com");
        wd.findElement(By.name("password")).sendKeys("ZaeblO11");

        wd.findElement(By.id("login")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }


}



