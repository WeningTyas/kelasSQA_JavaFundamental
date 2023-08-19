package com.juaracoding.fundamental;

////// HARI KE-3 ////////

public class Percabangan {
    public static void main(String[] args) {

        /// Pembuktian Percabangan ///
        if (true){// ← ini akan di eksekusi
            System.out.println("Benar!");
        }
        if (false){// ← ini tidak
            System.out.println("Salah!");
        }
        if (!false){// ← ini akan di eksekusi
            System.out.println("Salah!");
        }
        // N/b: Coba aja di Run satu-satu, tp dikomen dulu biar yakin -w-

        System.out.println();
        ////////////////////////////////////////////////////////////////

        ///============= if else... =================///
        int angka = 28;
        if (angka % 2 == 0){ // 0 == 0 (true)
            System.out.println(angka +" adalah bilangan genap");
        } else { // 1 == 0 (false)
            System.out.println(angka +" adalah bilangan ganjil");
        }

        System.out.println();
        ////////////////////////////////////////////////////////////////

        ///============= if majemuk (if pakai else) =================///
        // 91-100 = A, 84-90 = B, 75-83 = C, D
        int nilai = 40;
        if (nilai >= 91 && nilai <= 100){
            System.out.println("Nilai A");
        } else if (nilai >= 84 && nilai <= 90) {
            System.out.println("Nilai B");
        } else if (nilai >= 75 && nilai <= 83) {
            System.out.println("Nilai C");
        } else if (nilai >= 0 && nilai <= 74) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai tidak terdefinisi!");
        }

        System.out.println();
        ////////////////////////////////////////////////////////////////

        //============= nested if =================//

        // Yang bisa lewat jalan Sukarno
        // tidak bisa lewat karena tanggal ganjil
        // tidak bisa lewat karena plat nomor ganjil
        // tidak bisa lewat karena tanggal genap
        // tidak bisa lewat karena plat nomor genap

        // Hmm... berarti ga ada yg boleh lewat donk?

        /*
        * Kecuali:
        * - Plat genap hanya bisa lewat saat tgl genap, dan
        * - Plat ganjil hanya bisa lewat saat tgl ganjil
         * */

        int tgl = 22;
        int platNomor = 1231;

        System.out.println("Hari ini tanggal "+ tgl);
        if (tgl % 2 == 0) { // tanggal genap
            if (platNomor % 2 == 0) { // plat genap
                System.out.println("Silakan lewat!");
            } else {
                System.out.println("Tidak bisa lewat, krn plat nomor Ganjil!");
            }
        } else { // tgl ganjil
            if (platNomor % 2 != 0) { // plat ganjil
                System.out.println("Silakan lewat!");
            } else {
                System.out.println("Tidak bisa lewat, krn plat nomor Genap!");
            }
        }

        System.out.println();
        ////////////////////////////////////////////////////////////////

        //Gaji minimal 7 jt harus byr pajak
        //laki-laki sdh menikah = 5%
        //laki-laki blm menikah = 10%
        //Perempuan sdh menikah = 3%
        //Perempuan blm menikah = 6%

        double gaji = 8000_000;
        char gender = 'P'; // P atau L
        String status = "Blm Menikah"; // "Menikah" atau "Blm Menikah"
        if (gaji >= 7000_000){
            if (gender == 'P'){
                if (status.equalsIgnoreCase("Menikah")){
                    System.out.println("Pajak 3%");
                } else {
                    System.out.println("Pajak 6%");
                }
            } else {
                if (status.equalsIgnoreCase("Menikah")){
                    System.out.println("Pajak 5%");
                } else {
                    System.out.println("Pajak 10%");
                }
            }
        } else {
            System.out.println("Tidak wajib bayar pajak!");
        }

        System.out.println();
        ////////////////////////////////////////////////////////////////

        ///============= switch =================///
        int menu = 1;
        switch (menu) {
            case 1:
                System.out.println("File");
                break;
            case 2:
                System.out.println("Edit");
                break;
            case 3:
                System.out.println("View");
                break;
            default:
                System.out.println("Nilai tidak diketahui!");
                break;
        }

        System.out.println();
        ////////////////////////////////////////////////////////////////

        ///============= Tenary =================///
        int grade = 22;
        //              Jika A ? true : false;
        String output = (grade > 75) ? "Lulus!" : "Tidak Lulus";
        System.out.println(output);
    }
}
