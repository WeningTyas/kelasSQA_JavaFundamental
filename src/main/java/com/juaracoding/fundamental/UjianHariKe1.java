package com.juaracoding.fundamental;
import java.util.Scanner;

/*
* Dibuka aja komentarnya satu per satu
* */
public class UjianHariKe1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        ////Soal nomor 6 ////
//        System.out.println("Input di sini:");
//        int qty = scanner.nextInt();
//        double harga = scanner.nextDouble();
//
//        double jumlah = qty * harga;
//
//        System.out.println("Result");
//        System.out.println("Qty: " + qty);
//        System.out.println("Harga: " + harga);
//        System.out.println("Jumlah: " + jumlah);
//
//        //////////////////////////////////////////////
//
//        //Soal nomor 7 ////
//        System.out.println("Input di sini: ");
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//
//        boolean hasil = number1 != number2;
//
//        System.out.println("Hasil: " + hasil);
//
//        //////////////////////////////////////////////
//
//        ////Soal nomor 8 ////
//        System.out.println("Input di sini:");
//        String input = scanner.nextLine();
//
//        int length = input.length();
//        String upperCase = input.toUpperCase();
//        String lowerCase = input.toLowerCase();
//        String subString = input.substring(length - 3);
//
//        System.out.println("Hasil");
//        System.out.println(length);
//        System.out.println(upperCase);
//        System.out.println(lowerCase);
//        System.out.println(subString);
//
//        ////////////////////////////////////////////////

//        ////Soal nomor 9 ////
//        System.out.println("Input di sini");
//        String input = scanner.nextLine();
//
//        String hasil = "";
//
//        if (input.equalsIgnoreCase("Weekday")) {
//            hasil = "Senin, Selasa, Rabu, Kamis, Jum'at";
//        } else if (input.equalsIgnoreCase("Weekend")) {
//            hasil = "Sabtu dan Minggu";
//        } else {
//            hasil = "Invalid input";
//        }
//
//        System.out.println("Result");
//        System.out.println(hasil);
//
//        //////////////////////////////////////////////

        ////Soal nomor 10 ////
        int angka = scanner.nextInt();

        int nilai = 0;
        for (int i = 2; i <= angka; i += 2) {
            nilai += i;
        }

        System.out.println("Result");
        System.out.println("Jumlah angka genap tersebut adalah: " + nilai);

    }
}







