package com.juaracoding.oop;

////// HARI KE-8 ////////
/// Cara Encapsulation /////
public class Karyawan {

    //State harus dibuat sebagai Private
    private String firstName, lastName;
    private int age;
    private double salary;

    //get utk mengembalikan nilai yg dipanggil
    public String getFirstName() {
        return firstName;
    }

    //set kalau ada nilai baru masuk, lalu tampung
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
