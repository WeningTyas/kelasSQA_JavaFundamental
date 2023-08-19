package com.juaracoding.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingBrowserWindows {

    public static void main(String[] args) {
        String path = "E:\\Bootcam\\App\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");
        System.out.println("Buka Browser dan buka URL");

        //Waiting element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Open browser, open URL");

        //======================== Tab Button =================================//
        driver.findElement(By.id("tabButton")).click();

        ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());
        // pindah ke tab ke-2 di jendela browser
        driver.switchTo().window(newTb.get(1));
        String titleTwo = driver.getTitle();
        System.out.println("Judul Dua " + titleTwo); // ini memang kosong

        String halamanDua = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(halamanDua);

        delay(3);

        // tutup tab ke-2 klo udh selesai
        driver.close();

        // kembali ke tab sebelumnya
        driver.switchTo().window(newTb.get(0));
        String titleOne = driver.getTitle();
        System.out.println("Judul Satu " + titleOne);

        String halamanSatu = driver.findElement(By.className("main-header")).getText();
        System.out.println(halamanSatu);

        System.out.println("New Tab END");
        delay(5);

        //======================== New Window =================================//
        String parentWindowHandle = driver.getWindowHandle();

        driver.findElement(By.id("windowButton")).click();
        System.out.println("Klik New Windows");

        delay(3);

        Set<String> allWindowHandles = driver.getWindowHandles();
        // Iterasi melalui semua penanganan (handle) jendela
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                // Alihkan ke jendela baru
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        delay(3);
        System.out.println("Jendela baru dibuka");

        String newText = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(newText);

        // Jika perlu, kembali ke jendela pertama
        driver.switchTo().window(parentWindowHandle);
        System.out.println("New Windows END");
        delay(5);

        //======================== New Window Message =================================//
        driver.findElement(By.id("messageWindowButton")).click();

        Set<String> allWindowHandless = driver.getWindowHandles();

        delay(3);

        // Iterasi melalui semua penanganan (handle) jendela
        for (String windowHandle : allWindowHandless) {
            if (!windowHandle.equals(parentWindowHandle)) {
                // Alihkan ke jendela pesan baru
                driver.switchTo().window(windowHandle);

                // Dapatkan teks dari pesan di jendela baru
                String messageText = driver.findElement(By.tagName("body")).getText();
                System.out.println(messageText);

                // Menutup jendela pesan (opsional)
                driver.close();
                break;
            }
        }
        System.out.println("Jendela baru dibuka");
        delay(3);

        // Jika perlu, kembali ke jendela pertama
        driver.switchTo().window(parentWindowHandle);
        System.out.println("Tutup jendela aktif");

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
