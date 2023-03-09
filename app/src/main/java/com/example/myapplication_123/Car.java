package com.example.myapplication_123;

public class Car {
    private int Image;
    private String nameCar;

    public Car(int Image, String nameCar ){
        this.Image = Image;
        this.nameCar = nameCar;
    }
    public String getNameCar(){
        return nameCar;
    }
    public int getImage(){
        return Image;
    }
}
