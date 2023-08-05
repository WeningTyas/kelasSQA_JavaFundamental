package com.juaracoding.fundamental;

public class SoalPertemuanKe7 {
    int modelYear;
    String modelName;

    public SoalPertemuanKe7(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        SoalPertemuanKe7 myCar = new SoalPertemuanKe7(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
