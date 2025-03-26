package com.msayrac.Second;

public class Vehicle {
    protected String make;
    private double speed;
    protected int maxSpeed;
    private double distance;


    public Vehicle(String make, double speed, int maxSpeed, double distance) {
        this.make = make;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.distance = distance;
    }

    public Vehicle(String make, double speed, int maxSpeed) {
        this.make = make;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed<0){
            speed = 0;
        }
        if(speed>maxSpeed){
            speed = maxSpeed;
        }
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void speedUp(int amount){
        double oldSpeed =getSpeed();
        setSpeed(oldSpeed+amount);
        double newSpeed=getSpeed();
        double newDistance =(oldSpeed+newSpeed)/2;
        setDistance(getDistance()+newDistance);
    }

    public void speedDown(int amount){
        double oldSpeed =getSpeed();
        setSpeed(oldSpeed-amount);
        double newSpeed=getSpeed();
        double newDistance =(oldSpeed+newSpeed)/2;
        setDistance(getDistance()+newDistance);
    }

    public void showSpeed(){
        System.out.println(make + " aracının hızı : "+ getSpeed() + " Kat ettigi mesafe : "+getDistance());
    }



}
