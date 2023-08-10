package com.juaracoding.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//////// Day 16 ////////////
public class OrangeHRMNegative {
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

//        // =========================== LOGIN ================================ //
//        //Isi Username = Klik kanan > SelectorHub > Copy Relative Xpath
//        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
//        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//        WebElement btnLogin = driver.findElement(By.xpath("//button[contains(@class, 'login-button')]")); // → ini custom
//        ////  By.partialLinkText() mirip fungsi contains() gunanya mirip substring / potong kata  ////
//
//        delay(5);

//        // ======================== Negative: Tanpa Input Apapun ======================================= //
//        // masih di form login
//        username.sendKeys("");
//        password.sendKeys("");
//        btnLogin.click();
//        System.out.println("klik Login");
//
//        String reqUname = driver.findElement(By.xpath("//div[contains(@class, 'login-slot-wrapper')]")).getText();
//        String reqPassword = driver.findElement(By.xpath("//div[contains(@class, 'login-form')]")).getText();
//
//        if(reqUname.contains("Required") && reqPassword.contains("Required")){
//            System.out.println("negative 1: done");
//        } else {
//            System.out.println("Failed!");
//        }
//
//        //refresh halaman
//        driver.navigate().refresh();
//        delay(5);

//        // ======================== Negative: Salah satu Input kosong ======================================= //
//        // masih di form login
//        username.sendKeys("Admin");          // Admin
//        password.sendKeys("");      // admin123
//        btnLogin.click();
//        System.out.println("klik Login");
//
//        String reqUname = driver.findElement(By.xpath("//div[contains(@class, 'login-slot-wrapper')]")).getText();
//        String reqPassword = driver.findElement(By.xpath("//div[contains(@class, 'login-form')]")).getText();
//
//        if(reqUname.contains("Required") || reqPassword.contains("Required")){
//            System.out.println("negative 2: done");
//        } else {
//            System.out.println("Failed!");
//        }
//
//        //refresh halaman
//        driver.navigate().refresh();
//        delay(5);

//        // ======================== Negative: Salah Input ======================================= //
//        // masih di form login
//        username.sendKeys("Admin");          // Admin
//        password.sendKeys("admin1234");      // admin123
//        btnLogin.click();
//        System.out.println("klik Login");
//
//        String reqMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-content-text')]")).getText();
//
//        if(reqMessage.contains("Invalid credentials")){
//            System.out.println("negative 3: done");
//        } else {
//            System.out.println("Failed!");
//        }
        // ========================= MULAI Dari SINI ======================== //
        cobaLogin (driver, "", "");

        delay(3);
        System.out.println("Test 1 done");

        driver.navigate().refresh();

        cobaLogin (driver, "Admin", "");

        delay(3);
        System.out.println("Test 2 done");

        driver.navigate().refresh();

        cobaLogin (driver, "", "admin123");

        delay(3);
        System.out.println("Test 3 done");

        driver.navigate().refresh();

        cobaLogin (driver, "Admin", "admin1234");

        delay(3);
        System.out.println("Test 4 done");

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

    static void maximize (WebDriver driver){
        driver.manage().window().maximize();
    }

    static void cobaLogin(WebDriver driver, String uname, String pass){
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement btnLogin = driver.findElement(By.xpath("//button[contains(@class, 'login-button')]")); // → ini custom

        username.sendKeys(uname);// Admin
        password.sendKeys(pass); // admin123
        btnLogin.click();
        System.out.println("klik Login");

        delay(3);

        if(uname != "" && pass != ""){
            // salah input
            String reqMessage = driver.findElement(By.xpath("//p[contains(@class, 'alert-content-text')]")).getText();
            if(reqMessage.contains("Invalid credentials")){
                System.out.println("negative 1:");
            } else {
                System.out.println("Failed!");
            }
        } else {
            //ada yg kosong
            String reqUname = driver.findElement(By.xpath("//div[contains(@class, 'login-slot-wrapper')]")).getText();
            String reqPassword = driver.findElement(By.xpath("//div[contains(@class, 'login-form')]")).getText();
            if (reqUname.contains("Required") || reqPassword.contains("Required")) {
                System.out.println("negative 2:");
            } else {
                System.out.println("Failed!");
            }
        }
    }
}
