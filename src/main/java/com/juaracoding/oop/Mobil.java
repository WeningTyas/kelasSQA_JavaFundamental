package com.juaracoding.oop;

////// HARI KE-7 ////////

public class Mobil {

    //// Ini semua nnti dipanggil di MainApp ////

    String bahanBakar;
    int thnPembuatan = 2000;

    Mobil (String bahanBakar){
        this.bahanBakar = bahanBakar;
    }

    void warna() {
        System.out.println("Warnanya merah");
    }
    void mesin() {
        System.out.println("Mesin 1800 CC");
    }

    int getThnPembuatan(){
        return thnPembuatan;
    }
    String getBahanBakar(){
        return bahanBakar;
    }
}







