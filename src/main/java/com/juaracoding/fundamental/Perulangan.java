package com.juaracoding.fundamental;

////// HARI KE-4 ////////

public class Perulangan {
    public static void main(String[] args) {

        //================ Perulangan / Looping ====================//
        // ↓ tulis aja "fori" + enter nanti keluar ini
        for (int i = 0 ; i < 5; i++){
            // System.out.println(i);
            System.out.print(i + " ");
        }
        // Hasil: 0,1,2,3,4 karena 0 < 5

        System.out.println();
        ////////////////////////////////////////////////////////////////

        //  ↓ for (inisiasi; kondisi; in/decrement)
        for (int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
        // Hasil: 5,4,3,2,1 karena < 5 dan i > 0
        // titik mulainya di 5 dan sebelum 0/nol (beda dari yg di atas)


        System.out.println();
        ////////////////////////////////////////////////////////////////

        //// Hasilkan hanya nomor genap saja / Lompat 1 angka ////
        ////==== Cara 1 ====///
        for (int i = 0; i < 10; i+=2) { // ← langsung +2 (1)
            System.out.print(i + " ");
        }

        System.out.println();

        ////==== Cara 2 ====///
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){ // ← pakai modulus (2)
                System.out.print(i + " ");
            }
        }

        System.out.println();

        ////==== Cara 3 ====///
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1){
                continue;// ← pakai continue (3)
            }
            System.out.print(i + " ");
        }

        System.out.println();

        ////==== Cara 4 ====///
        for (int i = -1; i < 9; i++){
            i++; // ← pakai i++ 2x ↑
            System.out.print(i + " ");
        }


        System.out.println();
        ////////////////////////////////////////////////////////////////

        //// Buatlah bintang berbetuk kotak 5x5 ////
        int sisi = 5;

        ////==== Cara 1 ====///
        for (int i = 0; i < sisi; i++) {
            System.out.println("*****"); // ← Masih Statis / manual
        }

        System.out.println();

        ////==== Cara 2 ====///
        for (int i = 0; i < sisi; i++) {
            for (int j = sisi; j > 0 ; j--) {
                System.out.print("*");  // ← Cara dinamis 1
            }
            System.out.println();
        }

        System.out.println();

        ////==== Cara 3 ====///
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");  // ← Cara dinamis 2
            }
            System.out.println();
        }

        System.out.println();
        ////////////////////////////////////////////////////////////////

        //// Buatlah bintang segitiga 5x ////
        ////==== Cara 1.1 ====///
        for (int i = 0; i < sisi; i++){
            for (int j = 0; j < sisi - i; j++){ //Bedanya di sini
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        ////==== Cara 1.2 ====///
        for (int i = sisi; i > 0; i--){
            for (int j = i; j > 0; j--){ //Bedanya di sini
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        ////==== Cara 2.1 ====///
        for (int i = 1; i <= sisi; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        ////==== Cara 2.2 ====///
        for (int i = 0; i < sisi; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        ////==== Cara 3 ====///
        for (int i = 1; i <= sisi; i++){
            for (int j = sisi; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        System.out.println();

        //================ LENGTH() atau jumlah kata ====================//
        String password = "jakarta";
        System.out.println(password.length());

        if (password.length() >= 8){
            System.out.println("Silakan Masuk");
        } else {
            System.out.println("Password minimal 8 karakter!");
        }


        System.out.println();

        //================ Contoh Soal ====================//
        /*
        * Buatlah Ganjil = angka; genap = bintang (*), contoh:
        * 1*3*5*7
        * *3*5*7
        * 3*5*7
        * *5*7
        * 5*7
        * *7
        * 7
        * */

        int angka = 7;
        //Cara 1
        for (int i = 1; i <= angka; i++) {
            for (int j = angka; j >= i; j--) {
                if (i % 2 == 1){
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

        //Cara 2
        for (int i = 1; i <= angka; i++) {
            for (int j = angka; j >= i; j--) {
                if (j % 2 == 1){
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

        //Cara 3
        for (int i = 1; i <= angka; i++) {
            for (int j = i; j <= angka; j++) {
                if (j % 2 == 1){
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        // Apa bedanya, hmm?  -3-
    }
}
