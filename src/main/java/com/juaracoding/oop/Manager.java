package com.juaracoding.oop;

////// HARI KE-8 ////////

// Artinya Manager akan menurunkan (termasuk) Karyawan ↓
public class Manager extends Karyawan {
    private String departement;

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

}
