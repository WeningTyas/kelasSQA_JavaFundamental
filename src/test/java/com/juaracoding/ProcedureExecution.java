package com.juaracoding;
import org.testng.annotations.*;

////// HARI KE-10 ////////

public class ProcedureExecution {

    @BeforeClass // → dikasih nama terbalik Class-Methode-Test-Methode-Class
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethode(){
        System.out.println("Before Method");
    }

    @Test (priority = 2) // → priority gunanya utk prioritas yg mana fungsi
    // yg mau di dulukan, klo ga ada maka dieksekusi sesuai baris aja
    public void testSatu(){
        System.out.println("Test Satu");
    }
    @Test (priority = 1)
    public void testDua(){
        System.out.println("Test Dua");
    }
    @Test (timeOut = 3000) // → untuk eksekusi waktu
    public void testTiga(){
        System.out.println("Test Tiga");
    }

    @AfterMethod
    public void afterMethode(){
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
}
