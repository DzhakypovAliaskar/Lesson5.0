package com.company;

public class Car {
    int yearOfIssue;
    private int mileage;
    int enginePower;
    double price;
    String status;
    String company;


    public Car() {

    }

    public Car(double price, int yearOfIssue, int enginePower) {
        this.price = price;
        this.yearOfIssue = yearOfIssue;
        this.enginePower = enginePower;

    }

    public Car(String status, double price, int yearOfIssue, String company, int mileage) {
        this.status = status;
        this.price = price;
        this.yearOfIssue = yearOfIssue;
        this.company = company;
        this.mileage = mileage;
    }

    public void manualTransmission() {
        System.out.println("Четырехступенчатая каробка пердач");
    }

    public void additionalNotes() {
        System.out.println("Разгон до 100 - 2,9 секунды");
    }

    public void Speed() {
        System.out.println("Максимальная скорость: 380км/ч");

    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage <= 0) {
            System.out.println("Год выпуска не может быть меньшим или равным нулю!");
        } else {
            this.mileage = mileage;
        }
    }
}

