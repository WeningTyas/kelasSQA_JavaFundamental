package com.juaracoding;

import com.juaracoding.testNG.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

////// HARI KE-9 ////////


public class CanculatorTest {
    Calculator kalkulator = new Calculator(); // ← ke atas sini

    @Test // ← ini harus ditulis 1x per fungsi, diatas fungsi yg ingin di test
    public void testPenjumlahan(){
        //Calculator kalkulator = new Calculator(); // ← bagian ini udh di pindah ke atas
        int actual = kalkulator.penjumlahan(5,3);
        Assert.assertEquals(actual, 8);
    }

    @Test
    public void testPengurangan(){
        int actual = kalkulator.pengurangan(5,3);
        Assert.assertEquals(actual, 2);
    }

    ////Expect, Actual untuk memastikan (assert)
    //// Expect = nilai yg di harapkan, biasanya ditulis manual aja
    //// Actual = nilai yg didapatkan dari proses testing

    /*
                    HASILNYA di konsol:
     * ===============================================
        Default Suite
        Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
      ===============================================
      *
      */
}
