package com.juaracoding.OlshopCheat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopeeHalbolnas {
    public static void main(String[] args) {
        String path = "E:\\Bootcam\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);

        WebDriver driver = new ChromeDriver();
        Scroll scroll = new Scroll(driver);

        driver.get("https://shopee.co.id/PAKET-LENGKAP-KAMERA-CANON-600D-KIT-18-55MM-MEMORY-16GB-TAS-GARANSI-TOKO-i.60329673.7433009816");
        System.out.println("Buka Browser dan buka URL");
        delay(10);
        driver.findElement(By.name("loginKey")).sendKeys("dellarobbiaodd7@gmail.com");
        driver.findElement(By.name("password")).sendKeys("codeLYOKO");
        System.out.println("Isi");


        delay(10);

    }

    static void delay(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
