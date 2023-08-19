package com.juaracoding.oop;

public class Models {
    int modelYear;
    String modelName;

    public Models(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Models myCar = new Models(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
