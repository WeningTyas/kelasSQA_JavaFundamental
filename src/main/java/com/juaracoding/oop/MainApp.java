package com.juaracoding.oop;
import java.util.Scanner;

////// HARI KE-7 ////////

public class MainApp {
    public static void main(String[] args) {

        // ====== Memanggil Methode ====== //
        Mahasiswa murid = new Mahasiswa("Arum", "Mawarni", "Sastra");
        murid.viewProfile();

        System.out.println();

        Mobil mobil = new Mobil ("Pertalite");
        mobil.warna();
        mobil.mesin();
        System.out.println("Bahannya: "+ mobil.getBahanBakar());
        System.out.println("Tahun Pembuatan: "+ mobil.getThnPembuatan());

        System.out.println();

        //=========== Menggunakan scanner di methode OOP ==========//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input di sini:");
        int sisi = scanner.nextInt();
        Kotak kotak = new Kotak(sisi);
        System.out.println("Luas kotak "+kotak.luas());

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Echo chat:");
        String namaHari = input.next();
        System.out.println(hari(namaHari));

    }

    static String hari (String result){
        return result;
    }
}
