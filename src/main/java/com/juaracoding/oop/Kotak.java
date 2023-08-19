package com.juaracoding.oop;
import java.util.Date;

////// HARI KE-7 ////////

public class Kotak {

    //State
    double sisi;

    //Constructor = Special Methode
    public Kotak(double sisi){
        //keyword this
        this.sisi = sisi;
    }

    //Behavior / kegiatan (Methode)
    public double luas(){
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);

        // ↓ instance object namanya ini
        //   panggil class di class lain
        Kotak kotak = new Kotak(5);
        System.out.println("Luas kotak "+kotak.luas());
    }

}
