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
    //// Bagian kayak gini biasanya ada di dalam folder models
    //// dimana ini akan jadi jembatan dari backend ke fontend, dan sebaliknya
}
