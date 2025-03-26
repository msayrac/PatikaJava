package com.msayrac.Second;

public class Automobile extends Vehicle {

    public Automobile(String make, double speed, int maxSpeed) {
        super(make, speed, maxSpeed);
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

    void hornSound(){

        System.out.println(make + " marka otomobilin kornası çalıyor: Düt Düt");
    }
   public void speedUp(){
        super.speedUp(15);
    }
    public void speedDown(){
        super.speedDown(15);
    }

}
