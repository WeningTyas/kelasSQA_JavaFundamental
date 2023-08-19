package com.juaracoding.testNG;

public class Kotak {

    //keliling = 4 x sisi
    //luas = sisi x sisi

    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double keliling(double sisi){
        return 4*sisi;
    }
    public double luas(double sisi){
        return sisi*sisi;
    }
}
