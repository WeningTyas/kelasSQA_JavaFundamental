package com.juaracoding.oop;
import java.util.ArrayList;

////// HARI KE-10 ////////

public class CollectionJava {
    public static void main(String[] args) {

        /////////////////  ArrayList  /////////////////////
        ArrayList<String> mobil = new ArrayList<>();
        mobil.add("BMW"); // ← menambahkan data
        mobil.add("Ford");
        mobil.add("Mazda");
        mobil.add("Hyundai");

        System.out.println(mobil.size()); // ← menampilkan jumlah data ke samping
        System.out.println(mobil);
        System.out.println(mobil.get(2));

        mobil.set(1,"Toyota"); // ← mengganti array
        System.out.println(mobil);

        mobil.remove(2); // ← menghapus data array
        System.out.println(mobil);

        mobil.clear(); // ← membersihkan data array
        System.out.println(mobil);

        //// Tampilkan ke bawah ////
        for (int i = 0; i < mobil.size(); i++) {
            System.out.println(mobil.get(i));
        }
        for (String mobilItem : mobil ) {
            System.out.println(mobilItem);
        }

    }
}
