package com.juaracoding.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;


//////// Day 17 ////////////
public class BrowserStack {
    public static void main(String[] args) {

        String path = "E:\\Bootcam\\App\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();
        maximize(driver);

        try {
            driver.get("https://www.browserstack.com/");
            System.out.println("Buka Browser dan buka URL");

            //Waiting element
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("Open browser, open URL");

            //Accept All Cokies tambahin try catch juga
            WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[contains(@class, 'cookie-notification')]"));
            if (acceptCookiesButton.isDisplayed() && acceptCookiesButton.isEnabled()) {
                acceptCookiesButton.click();
                System.out.println("Accept Cookies");
            }

            // Hitung jumlah menunya
            Actions action = new Actions(driver); // menu ↓ di bwh ini ga boleh jauh dari Actions
            List<WebElement> listMenu = driver.findElements(By.xpath("//*[@id=\"product-nav\"]/ul/li"));
            System.out.println(listMenu.size());

            for (int i = 0; i < listMenu.size(); i++) {
                System.out.println(listMenu.get(i).getText());
            }
            System.out.println();
            for (WebElement items:listMenu ) {
                System.out.println(items.getText());
            }
            System.out.println();

            //Membuat Action dengan mouse
            WebElement btnGetStarted = driver.findElement(By.xpath("//a[@id='signupModalButton']"));
            //aksi.moveToElement(btnGetStarted).perform();// ← ini untuk hover aja
            action.moveToElement(btnGetStarted).click().perform();// ← ini hover dan lalu klik
            System.out.println("klik Get Started");

            // Test pakai tombol Back
            driver.navigate().back();
            System.out.println("Kembali");

            driver.navigate().refresh();
            delay(5);

            /*
            * Gk usah panik emng kamvret yg dibawah ini
            * pastin nnti ada kendala di sini ↓ pdhl td diatas udh oke
            * kadang bisa, kadang nggak soalnya
            * By.xpath("//*[@id=\"product-nav\"]/ul/li")
            * */

            // Hover menu Produk
            //// Diantara 3 ini yg bisa ↓ biasanya 3x baru berhasil =3=
            //WebElement btnMenuProduct = driver.findElement(By.xpath("//*[@id=\"product-nav\"]/ul/li"));
            //WebElement btnMenuProduct = driver.findElement(By.xpath("//button[contains(@id, 'product-menu')]"));
            WebElement btnMenuProduct = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
            action.moveToElement(btnMenuProduct).perform();// ← ini untuk hover
            System.out.println("klik produk menu");

            delay(3);
            driver.quit();
            System.out.println("Keluar dari Browser");

        } finally {
            driver.quit();
            System.out.println("Loading gagal");
        }
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    static void maximize (WebDriver driver){
        driver.manage().window().maximize();
    }
}
