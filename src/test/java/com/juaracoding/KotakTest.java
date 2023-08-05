package com.juaracoding;

import com.juaracoding.testNG.Kotak;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KotakTest {

    //keliling = 4 x sisi
    //luas = sisi x sisi
    Kotak kotak = new Kotak();

    @BeforeClass
    public void setKotak(){
        kotak.setSisi(5);
    }

    @Test
    public void testLuas(){
        double actual = kotak.luas(kotak.getSisi());
        double expect = 25;
        Assert.assertEquals(actual, expect);
    }
    @Test
    public void testKeliling(){
        double actual = kotak.keliling(kotak.getSisi());
        double expect = 20;
        Assert.assertEquals(actual, expect);
    }
}
