package com.juaracoding.fundamental;


////// HARI KE-5 ////////

public class ArrayJava {
    public static void main(String[] args) {

        //// String nama1 [0], nama2 [1], nama3 [2], nama4 [3], dst...
        String[] nama = {"Deni", "Almira", "Shinta", "Arma"}; // ← Cara 1
        // String nama[] = {"Deni", "Almira", "Shinta", "Arma"}; // ← Cara 2

        System.out.println(nama.length); // ← jumlah data yg ada di "nama"
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.print(nama[2]+ " itu teman ");
        System.out.println(nama[3]);

        System.out.println("// -------------------------- //");
        System.out.println();
        /////////////////////////////////////////////////////////////////////////

        //// PATCH DATA /////
        System.out.println("========== CARA KE-1 ===========");

        //// ====== Munculkan nama2 yg ada di data "Nama" ===== ////
        //// Cara ke-1, pakai For
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }

        System.out.println();

        //Cara ke-2, pakai ForEach
        for (String peserta:nama) {
            System.out.println(peserta);
        }

        System.out.println();
        System.out.println("========== CARA KE-2 ===========");

        //Pakai koleksi Array
        // kembaliannya null klo data kosong ↓
        String[] peserta = new String[4]; // ← soalnya ini isinya seharusnya ada 4
        peserta[0] = "Arman";
        peserta[1] = "Rinda";
        peserta[2] = "Safira";
        peserta[3] = "Miranda"; // ← misal ini dicomment

        // Overwritten, ubah langsung datanya
        peserta[2] = "SafiraFirda";
        System.out.println(peserta[2]);

        //// Cara ke-1, pakai For
        for (int i = 0; i < peserta.length; i++) {
            System.out.println(peserta[i]);
        }

        System.out.println();

        //Cara ke-2, pakai ForEach
        for (String i : peserta){
            System.out.println(i);
        }

        System.out.println("// -------------------------- //");
        System.out.println();
        /////////////////////////////////////////////////////////////////////////

        //// Tentang Integer dan Int (primitif) ////
        // ↓ kembaliannya null klo data kosong
        Integer[] nilai1 = new Integer[4];
        nilai1[0] = 9;
        nilai1[1] = 10;
        for (Integer grade : nilai1){
            System.out.println(grade);
        }

        System.out.println();

        // ↓ kembaliannya nol/0 klo data kosong
        int[] nilai2 = new int[4]; // ← soalnya ini isinya seharusnya ada 4
        nilai2[0] = 9;
        nilai2[1] = 10; // ← tp ini datanya cuma 2
        for (Integer grade : nilai2){
            System.out.println(grade);
        }

        System.out.println("--------------------");

        // Tipe data Objek
        Integer stok = 100;
        System.out.println(stok.toString()); //<--- berubah bentuk jd string bukan integer lagi


        System.out.println("========== Array Multidimensi ===========");

        //// Nilai Matriks
        int [][] angkaKu = {{1,2,3,4}, {5,6,7}};

        int x = angkaKu[1][2]; // angaKu[baris][kolom]
        System.out.println(x);
        System.out.println(angkaKu.length);

        System.out.println();

        for (int i = 0; i < angkaKu.length; i++) {
            for (int j = 0; j < angkaKu[i].length; j++) {
                System.out.print(angkaKu[i][j] + "|");
            }
            System.out.println();
        }

        /*
        * |1|2|3|4|   ↔  |0|1|2|3|4| dst...| (baris)
        * |5|6|7|     ↔  |1|
        *             ↔  |2|
        *             ↔  |3|
        *             ↔  |dst..| (kolom)
        * Baca: → = Baris, ↓ = kolom
        */

        System.out.println();

        //// Inisiasi pakai var, ini bisa menyesuaikan
        var angka = "100"; // 100100
        //var angka = 100; // ← pasti beda hasilnya klo pake ini
        System.out.println(angka+100);

        System.out.println();
        /////////////////////////////////////////////////////////////////////////

        int angkaAkhir = 50;
        int sum = 0;

        for (int i = 1; i <= angkaAkhir; i++) {
            // ↓ sum = sum + i
            sum += i; // 1+2+3+...+50
        }
        System.out.println(sum);


    }
}
