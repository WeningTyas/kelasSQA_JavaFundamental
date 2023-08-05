package com.juaracoding.fundamental;


////// HARI KE-5 ////////

public class SortingJava {
    public static void main(String[] args) {

        ////// Bagaimana cara menghasilkan output kata terpanjang //////
        String[] buah = {"apel", "manggis", "mangga", "jeruk", "pisang"};

        String buahTerpanjang = buah[0];

        //loop untuk mencari buah yg namanya terpanjang
        for (int i = 1; i < buah.length; i++) {
            if (buah[i].length() > buahTerpanjang.length()){
                buahTerpanjang = buah[i];
            }
        }
        System.out.println("Buah dgn nama terpanjang adalah "+ buahTerpanjang);
        //Kalau ada 2 (atau lebih data dgn kondisi yg "sama", maka yg akan dipilih adalah yg paling depan/duluan muncul



    }
}
