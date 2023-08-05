package com.juaracoding;

import com.juaracoding.testNG.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

////// HARI KE-9 ////////


public class CanculatorTest {
    Calculator kalkulator = new Calculator();

    @Test // ← ini harus ditulis 1x per fungsi, diatas fungsi yg ingin di test
    public void testPenjumlahan(){
        //Calculator kalkulator = new Calculator();
        ////Expect, Actual untuk memastikan (assert)////
        int actual = kalkulator.penjumlahan(5,3);
        Assert.assertEquals(actual, 8);
    }

    @Test
    public void testPengurangan(){
        //Calculator kalkulator = new Calculator();
        ////Expect, Actual untuk memastikan (assert)////
        int actual = kalkulator.pengurangan(5,3);
        Assert.assertEquals(actual, 2);
    }


    /*
     * ===============================================
        Default Suite
        Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
      ===============================================
      *
      */
}
