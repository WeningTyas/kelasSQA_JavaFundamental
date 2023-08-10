package com.juaracoding.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//////// Day 16 ////////////
public class OrangeHRM {
    public static void main(String[] args) {
        String path = "E:\\Bootcam\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();
        maximize(driver);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Buka Browser dan buka URL");

        //Waiting element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Open browser, open URL");

        // =========================== LOGIN ================================ //
        //Isi Username = Klik kanan > SelectorHub > Copy Relative Xpath
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement btnLogin = driver.findElement(By.xpath("//button[contains(@class, 'login-button')]")); // → ini custom
        ////  By.partialLinkText() mirip fungsi contains() gunanya mirip substring / potong kata  ////

        //Login ke Web
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        btnLogin.click();

        //Menuju Dashboard
        WebElement Dashboard = driver.findElement(By.xpath("//h6[contains(@class, 'topbar-header-breadcrumb')]"));
        String txtDashboard = Dashboard.getText();
        System.out.println(txtDashboard);

        //verifikasi login
        verifikasi(txtDashboard, "Dashboard");

        delay(5);

        // =========================== LOGOUT ================================ //
        //Klik profilnya
        WebElement profil = driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']"));
        profil.click();
        //Klik Logout
        WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
        // ini pakai driver.findElement() ↑
        logout.click();
        System.out.println("logout berhasil");

        delay(5);

        // =========================== TESTING ===================//
        //// Test pakai tombol Back
        //driver.navigate().back();

        ////Ambil jumlah form input di halaman tsb
        List<WebElement> listInput = driver.findElements(By.xpath("//input"));
        // ini pakai driver.findElements() ↑
        System.out.println(listInput.size());

        //Masukkan kembali nilainya
        listInput.get(1).sendKeys("Admin");
        System.out.println("Input");

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
    // buatlah methode custom assert
    static void verifikasi(String actual, String expected){
        if (actual.contains(expected)){ // contains() dan equalsIgnoreCase()
            System.out.println("login berhasil!");
        } else {
            System.out.println("Login gagal");
        }
    }
    static void maximize (WebDriver driver){
        driver.manage().window().maximize();
    }
}
