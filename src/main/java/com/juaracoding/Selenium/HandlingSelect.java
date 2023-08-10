package com.juaracoding.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HandlingSelect {
    public static void main(String[] args) {
        String path = "E:\\Bootcam\\App\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");
        System.out.println("Buka Browser dan buka URL");

        //Waiting element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Open browser, open URL");

        //Handling Select utk Dropdown, cara 1
        driver.findElement(By.id("oldSelectMenu")).sendKeys("White");

        //Handling Select utk Dropdown, cara 2
        WebElement warna = driver.findElement(By.id("oldSelectMenu"));
        Select pilihWarna = new Select(warna);
        pilihWarna.selectByValue("2"); // → tergantung primary key yg ada di Locatornya, bisa: Value, Index, VisibleValue

        delay();
        driver.quit();
        System.out.println("Keluar dari Browser");
    }

    public static void delay(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

/*
* Untuk testing Dropbox atau List bisa dilakukan dgn:
* - Tekan klik, tekan tombol bawah dan Enter
* - atau pakai xpath
* */

