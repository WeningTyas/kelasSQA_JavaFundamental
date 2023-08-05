package com.juaracoding.oop;

////// HARI KE-10 ////////

public class ErrorHandling {
    public static void main(String[] args) {

        //// Jenis Error yg sudah / belum di modifikasi
        try {
            // ↓ ini udh pasti error
            int nilai = 1/0;
        } catch (Exception e){
            // e.printStackTrace(); // ← belum di modifikasi
            System.err.println("Error"); // ← sudah di modifikasi
        }
        System.out.println("Juara Coding");
    }
}
