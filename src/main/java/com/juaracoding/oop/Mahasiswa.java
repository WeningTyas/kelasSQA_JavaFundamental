package com.juaracoding.oop;

////// HARI KE-7 ////////

public class Mahasiswa {

    ///// State //////
    //First Name, Last Name, Prodi
    String firstName, lastName, prodi;

    //Constructor = Special Methode
    public Mahasiswa(String firstName, String lastName, String prodi){
        this.firstName = firstName;
        this.lastName = lastName;
        this.prodi = prodi;
    }
    ////Behavior / kegiatan (Methode)////
    public void viewProfile(){
        System.out.println("Nama Depan: " + firstName);
        System.out.println("Nama Belakang: " + lastName);
        System.out.println("Jurusan: " + prodi);
    }


    public static void main(String[] args) {
        Mahasiswa murid = new Mahasiswa("Rina","Astuti", "Bisnis");
        murid.viewProfile();
    }
}
