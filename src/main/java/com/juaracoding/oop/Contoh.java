package com.juaracoding.oop;

////// HARI KE-8 ////////

public class Contoh {
    public static void main(String[] args) {

        /////////// Object Oriented Programing / OOP ///////////
        //=========== Pemanggilan Getter & Setter / Metode Encapsulation ===========//
        Karyawan karyawan = new Karyawan();
        karyawan.setFirstName("Kirana");
        karyawan.setLastName("Rinanti");
        karyawan.setAge(20);
        karyawan.setSalary(2000_000);

        System.out.println(karyawan.getFirstName());
        System.out.println(karyawan.getLastName());
        System.out.println(karyawan.getAge());
        System.out.println(karyawan.getSalary());

        System.out.println();

        // ============= Overriding / Polimorp ============//
        // ↓ BangunDatar itu homenya
        //   SegiTiga itu turunannya ↓
        BangunDatar bentuk = new SegiTiga();
        bentuk.gambar();

        System.out.println();

        // ============= Inheritance ============//
        // Manager ↓ ini home asalnya yg juga memanggil Karyawan
        // karena ada extends di sana
        Manager user = new Manager();
        user.setFirstName("Malla");
        user.setLastName("Atika Sari");
        user.setAge(20);
        user.setSalary(3000_000);
        user.setDepartement("HI");

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
        System.out.println(user.getSalary());
        System.out.println(user.getDepartement());

    }
}
