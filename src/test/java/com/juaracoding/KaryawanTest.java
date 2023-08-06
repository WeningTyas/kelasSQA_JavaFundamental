package com.juaracoding;

////// HARI KE-9 ////////

import com.juaracoding.oop.Karyawan;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KaryawanTest {
    Karyawan karyawan = new Karyawan();

    @Test
    public void testFirstName(){
        String actual = "Tia";
        karyawan.setFirstName(actual);
        String espect = karyawan.getFirstName();
        Assert.assertEquals(actual, espect);
    }
    @Test
    public void testLastName(){
        karyawan.setLastName("Almira");
        String actual = karyawan.getLastName();
        String espect = "Almira";
        Assert.assertEquals(actual, espect);
    }

}
