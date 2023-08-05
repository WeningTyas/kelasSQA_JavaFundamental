package com.juaracoding.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

////// HARI KE-13 ////////

public class Main {
    public static void main(String[] args) {
        // Setting untuk WebDrivernya
        System.setProperty("webdriver.chrome.driver", "E:\\Bootcam\\ChromeDriver\\chromedriver.exe");
        // Panggil WebDriver-nya untuk menjalankan browser
        WebDriver driver = new ChromeDriver(); //constructor/special methode

        // Tuliskan nama webnya dan jalankan di browser
        driver.get("https://www.google.com/");
        System.out.println("Buka Browser dan buka URL");

        // Pakai elemen / objek dgn nama "q" dan tulis / ketikkan "Juara Coding" lalu klik Esc
        driver.findElement(By.name("q")).sendKeys("Juara Coding" + Keys.ESCAPE);
        System.out.println("Tuliskan keyword dan klik Esc");

        // Pakai elemen / objek dgn nama "btnK" dan klik objeknya
        driver.findElement(By.name("btnK")).click();
        System.out.println("Klik tombol Cari");

        // Keluar / kill dari Chrome
        try { // ← pakai try & catch karena sleepnya error
            Thread.sleep(5000); //untuk delay sejenak, 5 second
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Keluar dari Browser");

        // Karena klo ga di close, nanti Chromenya jadi punya kegebunshin

    }
}
