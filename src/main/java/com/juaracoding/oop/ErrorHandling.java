package com.juaracoding.oop;

////// HARI KE-10 ////////

public class ErrorHandling {
    public static void main(String[] args) {

        //// Jenis Error yg sudah / belum di modifikasi
        try {
            // ↓ ini udh pasti error, maka
            int nilai = 1/0;
        } catch (Exception e){
            // e.printStackTrace(); // ← belum di modifikasi, masih muncul error merah dikonsol
            System.err.println("Error"); // ← sudah di modifikasi, pesan error diubah jadi "Error" aja
        }
        System.out.println("Juara Coding");
    }
}
