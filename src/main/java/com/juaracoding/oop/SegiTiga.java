package com.juaracoding.oop;

////// HARI KE-8 ////////

// Harus pakai "extends Homenya (BangunDatar)" ↓
public class SegiTiga extends BangunDatar{
    @Override // ← juga pakai ini
    void gambar(){
        for (int i = 0; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
