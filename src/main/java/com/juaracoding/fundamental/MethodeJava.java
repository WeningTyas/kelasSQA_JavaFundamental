package com.juaracoding.fundamental;

////// HARI KE-6 ////////

public class MethodeJava {
    public static void main(String[] args) {
        kotak(); // ← tanpa parameter
        System.out.println();
        persegi(3); // ← dengan parameter
        System.out.println();
        System.out.println(penjumlahan(2,3)); // ← dengan parameter
        System.out.println();

        //// Function Cek Password
        System.out.println(cekPassword("asal dulu aja"));

        //// Function Cek Login
        String uname= "Sarah";
        String password= "123";
        if (cekLogin(uname, password)){
            System.out.println("ke Beranda");
        } else {
            System.out.println("tetap di Login");
        }

        ////// Pemanggilan Fuction Static //////
        //Perlu dibuat pemanggilan baru
        // ↓ dibaca: class sebutan = new class()
        // nanti tinggal di panggil aja sebutannya
        MethodeJava draw = new MethodeJava();
        draw.LuasKubus(5);

        //Function berbaris
        System.out.println(luasKubus(5));

        ////////////////////////////////////////////////////////////////////////
        //Tugas:
        //1. Kotak (luas, keliling)
        //2. Kubus (volume, luas, keliling)
        int pilihan = 1;
        int nilai = 5;
        switch (pilihan){
            case 1:
                System.out.println("Kotak sisi " + nilai);
                System.out.println("Luas " + kotakLuas(nilai) +
                        ", Keliling "+ kotakKeliling(nilai));
                break;
            case 2:
                System.out.println("Kubus " + nilai + " sisi");
                System.out.println("Volume " + kubusVolume(nilai)+
                        ", Luas "+kubusLuas(nilai)+
                        ", Keliling "+kubusKeliling(nilai));
                break;
            default:
                System.out.println("Nilai tidak diketahui");
        }
    } // ← main sampai sini

    ////////////////////// Ini diluar main //////////////////////////////
    //// Function java tanpa parameter
    static void kotak(){
        int sisi = 5;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //// Dengan parameter
    static void persegi(int sisi){
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //// Dengan parameter
    static int penjumlahan(int a, int b){
        return a+b;
    }

    ////////////////////////////////////////////////////////////////////////
    // Buatlah fuction cek password & Login menggunakan java
    static boolean cekPassword(String password){
        return password.equals("1234");
    }
    static boolean cekLogin(String uname, String password){
        if (uname.equals("Sarah") && password.equals("1234")){
            return true;
        } else {
            return false;
        }
    }

    ////////////////////////////////////////////////////////////////////////
    //Pemanggilan Fuction Static
    public void LuasKubus (int sisi){
        System.out.println((sisi*sisi) * 6);
        //gak perlu return, karena cuma print, bukannya fungsi pengembalian
    }

    //Function berbaris
    static int luasKotak(int sisi){
        return sisi*sisi;
    }
    static int luasKubus(int sisi){
        return luasKotak(sisi)*6;
    }

    ////////////////////////////////////////////////////////////////////////

    static int kotakLuas(int sisi){
        return sisi*sisi;
    }
    static int kotakKeliling (int sisi){
        return 4*sisi;
    }
    static int kubusLuas(int sisi){
        return 6*kotakLuas(sisi);
    }
    static int kubusKeliling(int sisi){
        return 12*sisi;
    }
    static int kubusVolume(int sisi){
        return sisi*kotakLuas(sisi);
    }
}
