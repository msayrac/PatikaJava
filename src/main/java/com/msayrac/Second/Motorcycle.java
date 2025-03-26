package com.msayrac.Second;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, double speed, int maxSpeed) {
        super(make, speed, maxSpeed);
    }


    void frontLift(){
        System.out.println(getMake() + " marka motorsiklet ön tekeri kaldırınca devrildi!");
        setSpeed(0);
    }

    public void speedUp(){
        super.speedUp(10);
    }
    public void speedDown(){
        super.speedDown(10);
    }
}


