package com.juaracoding.fundamental;

////// HARI KE-2 ////////

public class Operator {
    public static void main(String[] args) {

        int modulus = 5 % 2; //sisa pembagian
        System.out.println(modulus);

        System.out.println();
        ////////////////////////////////////////////////////////////////

        /// Increment / Decrement ///
        int grade = 9;
        grade++;
        System.out.println(grade);
        --grade;
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

        /// Relational Operator ///
        boolean isResult = 5 > 5;
        System.out.println(isResult);

        /// Operator Bitwise | Diubah ke biner dahulu ///
        int isHasil = 10 & 12;
        System.out.println(isHasil);

        int x = 5;
        x &= 3;
        System.out.println(x);

    }
}
