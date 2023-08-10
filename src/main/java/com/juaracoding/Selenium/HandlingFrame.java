package com.juaracoding.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingFrame {
    public static void main(String[] args) {
        String path = "E:\\Bootcam\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/frames");
        System.out.println("Buka Browser dan buka URL");

        //Waiting element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Open browser, open URL");

        //Handling iFrame 1
        WebElement frameOne = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frameOne); // Selalu disarankan utk pakai parameter WebElement
        WebElement samplePageOne = driver.findElement(By.id("sampleHeading"));
        String textSampleOne = samplePageOne.getText();
        System.out.println(textSampleOne);

        // kembali ke nilai sebelumnya = kembali menjadi frame
        driver.switchTo().defaultContent();

        JavascriptExecutor jx = (JavascriptExecutor) driver;
        jx.executeScript("window.scrollBy(0,500)");

        //Handling iFrame 2
        WebElement frameTwo = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frameTwo); // Selalu disarankan utk pakai parameter WebElement
        WebElement samplePageTwo = driver.findElement(By.id("sampleHeading"));
        String textSampleTwo = samplePageTwo.getText();
        System.out.println(textSampleTwo);

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
