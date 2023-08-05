package com.juaracoding.fundamental;

////// HARI KE-2 ////////

public class VariableJava {  // ← ini blok program ke-5

    public int luas; // variabel publik

    public static void main(String[] args) {  // ← ini blok program ke-4

        System.out.println("Rumus Bagun Ruang");
        System.out.println("Rumus Bagun Datar");

        // Scope / blok program itu ditandai oleh kurung kurawal
        { // ← ini blok program ke-1
            int nilai = 10;
            if (true) { // ← ini blok program ke-2
                System.out.println("IF Statement");
            }
            for (int i = 0; i < 2; i++) {  // ← ini blok program ke-3
                System.out.println(i);
                System.out.println(nilai);
            }
        }

        System.out.println();
        ////////////////////////////////////////////////////////////////

        String namaBootCamp, alamat;
        namaBootCamp = "Juara Coding";
        alamat = "Jakarta";
        alamat = "Bekasi";
        System.out.println(namaBootCamp);
        System.out.println(alamat);
        // ↑ maka yg di eksekusi adalah koding terakhir (rewrite)

        System.out.println();
        ////////////////////////////////////////////////////////////////

        /// Tipe Data ///
        String bahasa = "Indonesia"; // ← menampilkan huruf dan kalimat, wajib pakai dobel quote ""
        int angka = 1;
        float nilai = 9.2f;
        double saldo = 400_000;
        char predikat = 'A'; // ← menampilkan 1 huruf aja, harus pakai quote ''
        boolean isResult = true;  // ← wajib pakai 'is' di depan utk methode dan variable

        System.out.println();
        ////////////////////////////////////////////////////////////////

        //// OOP - Method instance Objek ///
        VariableJava bangunDatar = new VariableJava(); //instance object
        bangunDatar.luas = 42;
        System.out.println(bangunDatar.luas);

        System.out.println();
        ////////////////////////////////////////////////////////////////

        /// Escape Character ///
        String pathImages = "D:\\Perpustakaan\\Bahasa Program\\Bootcam SQA";
        System.out.println(pathImages);

        System.out.println();
        ////////////////////////////////////////////////////////////////

        /// Casting / Promotion ///
        // A. Implisit Casting
        short tinggi = 1000;
        int dataTinggiInt = tinggi;
        double dataTinggiDouble = tinggi;
        System.out.println(dataTinggiDouble);

        char huruf = 'J';
        long dataHuruf = huruf;
        System.out.println(dataHuruf);
        // ↑ Angka yg di dapat dari long adalah konversi dari ASCII

        // A. Eksplisit Casting
        long dataLong = 9223;
        int dataInt = (int) dataLong;
        System.out.println(dataInt); // ← ini berubah jadi Integer bukan Long lagi

    }
}

/*
* SPILL Soal Test Interview
* Hitung jumlah kata dari sebuah kata = "JAKARTA"
* */