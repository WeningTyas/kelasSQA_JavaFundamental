package com.juaracoding.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingAlert {
    public static void main(String[] args) {
        String path = "E:\\Bootcam\\App\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");
        System.out.println("Buka Browser dan buka URL");

        //Waiting element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Open browser, open URL");

        //Handling Alert, alert 1
        WebElement clickAlertButton = driver.findElement(By.id("alertButton"));
        clickAlertButton.click();
        driver.switchTo().alert().accept();
        System.out.println("Alert berhasil di klik! (1)");

        delay(5);

        //Handling Alert, alert 2
        WebElement click5sec = driver.findElement(By.id("timerAlertButton"));
        click5sec.click();
        delay(5);
        driver.switchTo().alert().accept();
        System.out.println("Alert berhasil di klik! (2)");

        delay(5);

        //Handling Alert, alert 3
        WebElement clickConfirm = driver.findElement(By.id("confirmButton"));
        clickConfirm.click();
        driver.switchTo().alert().accept(); // Setujui / Accept, True
        delay(3);
        clickConfirm.click();
        driver.switchTo().alert().dismiss(); // Batalkan / Cancel, False
        System.out.println("Alert berhasil di klik! (3)");

        delay(5);

        //Handling Alert, alert 4
        WebElement clickPrompt = driver.findElement(By.id("promtButton"));
        clickPrompt.click();
        driver.switchTo().alert().sendKeys("Test");
        delay(3);
        driver.switchTo().alert().accept();
        System.out.println("Alert berhasil di klik! (4)");

        delay(5);

        driver.quit();
        System.out.println("Keluar dari Browser");
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
