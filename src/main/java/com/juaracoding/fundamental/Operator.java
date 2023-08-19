package com.juaracoding.fundamental;

////// HARI KE-2 ////////

public class Operator {
    public static void main(String[] args) {

        //modulus adalah sisa pembagian
        // (misal 5 ↔ 2*2=4 & sisa 1)
        // bisa dipakai utk mencari angka ganjil genap
        int modulus = 5 % 2;
        System.out.println(modulus);

        System.out.println();
        ////////////////////////////////////////////////////////////////

        /// Increment / Decrement ///
        int grade = 9;
        grade++; // ← nilai bertambah
        System.out.println(grade);
        --grade; // ← nilai berkurang
        System.out.println(grade);

        System.out.println();
        ////////////////////////////////////////////////////////////////

        /// Operator Asignment / Operator Penugasan ///
        int b = 3;
        b = b + 2;
        System.out.println(b);

        int c = 5;
        c += 2;
        System.out.println(c);

        System.out.println();
        ////////////////////////////////////////////////////////////////

        /// Relational Operator | true or false ///
        boolean isResult = 5 > 5;
        System.out.println(isResult);

        /// Operator Bitwise | Diubah ke biner dahulu ///
        int isHasil = 10 & 12;
        System.out.println(isHasil);
        /* Penjelasan:
        *  Angka 10 ↔ 1010      1 = true
        *  Angka 12 ↔ 1100      0 = false
        *  === Bila dibandingkan AND (&) ===
            1 0 1 0 (10)
          & 1 1 0 0 (12)
            -----------
            1 0 0 0   ↔   (ini biner Hasilnya = 8)
        */

        int x = 5;
        x &= 3;
        System.out.println(x);

        /* Penjelasan:
        *  Angka 5 ↔ 0101      1 = true
        *  Angka 3 ↔ 0011      0 = false
        *  === Bila dibandingkan AND (&) ===
            0 1 0 1 (5)
          & 0 0 1 1 (3)
            -----------
            0 0 0 1   ↔   (ini biner Hasilnya = 1)
        */
    }
}
